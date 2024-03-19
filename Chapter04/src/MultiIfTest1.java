/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 다중 if문 실습
 * 		하나의 정수를 입력 받아 짝수인지 홀수인지 판단하는 프로그램.
 * 
 * 문제분석 :  1.정수를 입력받는다.
 * 			2.만약에 입력받은 정수가 0보다 작은가?
 * 				2-1. "-0은 음수입니다." 출력한다.
 * 			3.아니고, 만야에 입력 받은 정수가보다 큰가?
 * 				3-1 "0은 양수입니다." 출
 * 
 * 알고리즘 :  1.정수를 입력받는다.
 * 			2.만약에 입력받은 정수가 0보다 작은가?
 * 				2-1. "-0은 음수입니다." 출력한다.
 * 			3.아니고, 만야에 입력 받은 정수가보다 큰가?
 * 				3-1. "0은 양수입니다." 출력한다.
 * 			
 */

import java.util.Scanner;

public class MultiIfTest1 {

	public static void main(String[] args) {
		
		//Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 1.정수를 입력 받는다.
		System.out.println("정수를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		// 2.음수인지
		if(num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
		// 3.아니면, 양수인지
		else if(num > 0) {
			System.out.println(num + "은(는)양수입니다.");
		}
		// 4. 아니면(0이다. num == 0)
		else{
			System.out.println("0입니다.");
		}

	}

}
