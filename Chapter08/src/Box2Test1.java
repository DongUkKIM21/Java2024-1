
public class Box2Test1 {

	public static void main(String[] args) {
		int myint1 = 100; // 지역변수, 기본 자료형 변수.
		int myint2 = myint1;
		
		System.out.println("첫 번째 값 : " + myint1 + "두 번째 값 : " + myint2);
		
		myint1 = 200;
		System.out.println("첫 번째 값 : " + myint1 + "두 번째 값 : " + myint2);
		
		Box2 mybox1 = new box2();
		Box2 mybox2 = new box2();
		
		mybox.width = 20;
		mybox.depth = 123;
		
		System.out.println("mybox1.width : " + mybox1.width);
		System.out.println("mybox1.height : " + mybox1.height);
		System.out.println("mybox1.depth : " + mybox1.depth);
		
		

	}

}
