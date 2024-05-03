//클래스 선언
class Initial{
	//멤버 변수 묵시적 값 설정 클래스 전체에서 사용
	//클래스 내 메소드 밖에 선언
	int number;	//속성 멤버 션수 객체 변수 
	double rate;	// 처기값이 없어도 된다
	String name;	// 묵시적 값으로 초기값이 지정
	int[] score;

	//메소드 선언 (소문자로 시작)
	public void aMethod() {
		int count = 0;
		System.out.println("number : " + number);
		System.out.println("count : " + count);
	}
}
public class InitialTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1;
		double var2;
		
		//변수에 초기값이 없어서 오류 발생
		System.out.println("지역 변수 var1의 값은 : " + var1);
		System.out.println("지역 변수 var2의 값은  : " + var2);
		
		Initial ob1 = new Initial(); //객체 생성
		
		System.out.println("지역 변수 number의 값은 : " + ob1.number);
		System.out.println("지역 변수 rate의 값은 : " + ob1.rate);
		System.out.println("지역 변수 name의 값은 : " + ob1.name);
		System.out.println("지역 변수 score의 값은 : " + ob1.score);

	}

}
