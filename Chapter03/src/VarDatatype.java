/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 변수와 자료형.
 */
public class VarDatatype {

	public static void main(String[] args) {
		// 상수 선언(대문자 선언)
		final int MAX = 100;
		final double PI = 3.14;
		
		//PI = 3.14159; //오류 발생. (상수는 한번 값이 결정되면 값이 변할 수 없다.)
		
		
		int r = 5; // 정수
		double pi = 3.14159; // 실수 	
		String name = "김동욱"; // 문자열
		char blood = 'A'; //문자
		//char blood = 'AB'; // 오류 발생. 문자는 1byte
		
		//원주율 출력
		System.out.println("원주율 = " + PI + "입니다.");
		System.out.println("원주율 = " + pi + "입니다.");
		
		// 원의 넓이를 계산한다. 
		double area = r * r * pi; 
		// 원의 넓이를 계산하여 출력
		System.out.println("반지름이" + r + "인 원의 넓이는 " + area + "입니다.");
		
		area = r * r * PI;
		System.out.printf("반지름이 %d인 원의 넓이는 %f입니다. \n", r, area);
	}

}
