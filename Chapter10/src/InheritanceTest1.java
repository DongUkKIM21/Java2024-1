/*
 * 작성일 : 2024년 5월 21일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 :	
 */

class A {
	public int aa =1;	//멤버변수. 모두 접근 가능
}

// A 클래스를 상속받음
class B extends A{
	private int bb = 2;	//멤버변수.B클래스에서만 접근 가능
	public int bb() {	//메소드. 모두 접근 가능.
		return bb;		//이 메소드를 이용하여 외부에서는
						//접근이 불가능한 bb를 사용할 수 있다.
	//이 클래스에는 aa,bb,bb()가 있다.
	}
}
class C extends B{
	//이 클래스에서는 aa,bb,bb(),cc가 있다.
	int cc = 3; //현정자 없음. 같은 패키지 내에서만 접근 가능.
}
public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C objc = new C();//객체 생성
		System.out.println("cc의 값은 ?" + objc.cc);	 // 3
		//System.out.println("bb의 값은 ?" + objc.bb);	 // 오류 발생. bb는 private로 선언이 되어서.
		System.out.println("bb의 값은 ?" + objc.bb()); //메ㄴㄴㄴ소드로 출력
		System.out.println("bb의 값은 ?" + objc.aa);
	}

}
