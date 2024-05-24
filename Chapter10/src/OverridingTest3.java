/*
 * 작성일 : 2024년 5월 24일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 :	메소드 오버라이딩3
 */
class OT3a{
	//매개 변수가 1개인 메소드 생성
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show(String str) 수행 : " + str);
	}
}
class OT3b extends OT3a{

	@Override
	public void show(String str) {
		// TODO Auto-generated method stub
		//super.show(str);	//상위 클래스의 메소드로 접근 할 때 사용.
		System.out.println("하위 클래스 메소드 show(String str) 수행 : " + str);
	}
}
public class OverridingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OT3b otb = new OT3b();
		otb.show("오늘은 금요일");

	}

}
