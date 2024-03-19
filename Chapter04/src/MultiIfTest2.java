/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 이중 if문 실습
 * 		하나의 정수를 입력 받아 짝수인지 홀수인지 판단하는 프로그램.
 * 
 * 문제분석 :  90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 *			60점 이상이면 D학점
 *			60점 미만이면 F학점 
 *			점수는 정수로 입력 받는다.
 * 
 * 알고리즘 :   1. 점수(정수)를 입력받는다.
 * 			 2. 점수가 90점 이상인가?
 * 				2-1. A학점입니다. 출력
 * 			 3. 아니면, 80점 이상인가?
 * 				3-1. B학점입니다. 출력
 * 			 3. 아니고, 70점 이상인가?
 * 				3-1. C학점입니다. 출력
 * 			 4. 아니고, 60점 이상인가?
 * 				3-1. D학점입니다. 출력
 * 			 5. 아니면(나머지는)
 * 				5-1 F학점입니다. 출력
 */

import java.util.Scanner;

public class MultiIfTest2 {

	public static void main(String[] args) {
		// Scnner 객체 생성.
		System.out.println("점수를 입력하세요 : ");
		Scanner stdIn = new Scanner(System.in);
		
		int score = stdIn.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점입니다.");
		}
		else if(score >= 80) {
			System.out.println("B학점입니다.");
		}
		else if(score >= 70) {
			System.out.println("C학점입니다.");
		}
		else if(score >= 60) {
			System.out.println("D학점입니다.");
		}
		else{
			System.out.println("F학점입니다.");
		}
		
		
		
				
	}

}
