/*
 * 작성일 : 2024년 5월 24일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 :
*/
class Box11 {
   public int width;
   public int height;
   public int depth;
   public Box11(int w,int h,int d) {
      width = w;
      height = h;
      depth = d;
   }
}

public class ObjectMethodTest4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box11 b1 = new Box11(10,20,30);
		Box11 b2 = new Box11(10,20,30);
		Box11 b3 = b2;
		
		System.out.println(b1.equals(b2)? "b1과 b2는 같다" : "b1과 b2는 다르다");
		System.out.println(b2.equals(b3)? "b2과 b3는 같다" : "b2과 b3는 다르다");
		
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		System.out.println(s1.equals(s2)? "s1과 s2는 같다" : "s1과 s2는 다르다");
		

	}

}
