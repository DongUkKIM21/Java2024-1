class Box1{
	int width, height, depth; //멤버 변수 
	
	//생성자 생성.
	//매개변수로 지정된 w,h,d는 의미를 알기 어렵다.
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class thisTest01 {

	public static void main(String[] args) {
		Box1 mybox = new Box1(1,2,3);
		System.out.println(mybox.width);

	}

}
