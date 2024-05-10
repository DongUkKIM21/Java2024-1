class Box6 {
	// 멤버 변수 - 객체변수. 클래스 전역에서 사용 가능
	int width;	
	int height; 
	int depth;
	
	double wwidth;	
	double hheight; 
	double ddepth;
	
	//생성자 오버로딩 - 정수형 매개변수 3개
	public Box6(int a, int b, int c) {
		width = a;
		height = b;
		depth = c;
	}
	
	//생성자 오버로딩 - 실수형 매개변수 3개
	public Box6(double a, double b, double c) {
		wwidth = a;
		hheight = b;
		ddepth = c;
	}
}
public class BoxOverloading01 {

	public static void main(String[] args) {
		// 정수형 매개변수가 3개인 생성자 호출.
		Box6 mybox1 = new Box6(10,20,30);
		int vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(정수형 매개 변수) : " + vol1);
		
		// 실수형 매개변수가 3개인 생성자 호출.
		Box6 mybox2 = new Box6(10.5,20.5,30.5);
		double dvol = mybox2.wwidth * mybox2.hheight * mybox2.ddepth;
		System.out.println("박스의 부피(실수형 매개 변수) : " + dvol);
		
		// 정수형, 실수형 매개변수가 3개인 생성자 호출. => 없다.
		// 혼합되어 있는 경우 자동으로 확대형으로 변환되어 수행.
		mybox1 = new Box6(10,20,30.5);
		dvol = mybox1.wwidth * mybox1.hheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수형 매개 변수) : " + dvol);

	}

}
