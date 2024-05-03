class Box3Test1{
	int width, height, depth;
	long idNum;
	static long BoxID= 0;
	
	//생성자는 객체가 생설될 때 자동으로 수행 됨
	public Box3Test1(){	//생성자 메소드 - 클래스 명과 같은 메소드 
		idNum = ++BoxID;
	}
}
public class Box3Test1 {

	public static void main(String[] args) {
		//객체 생성, Box3에 생성자가 있기에 객체가 생성되면 생성자가 수행이 된다
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();
		
												//객체 명을 통해서 값 출력
		System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
		System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
		System.out.println("mybox3의 id 번호 : " + mybox3.idNum);
		
		
		System.out.println("mybox4의 id 번호 : " + mybox4.idNum);
							//boxID는 클래스 변수이다.
							// 오류는 아니지만 클래스 변수는 클래스 명으로 접근한다.
		
		//클래스 명으로 boxID값 출력
		//Box3.boxID
		//클래스 명을 통해서 크랼스 변수 값을 출력하는 것이 원칙
		System.out.println("마지막 생성된 박스 번호는 : " + Box3.boxID + "입니다.");
		
		

	}

}
