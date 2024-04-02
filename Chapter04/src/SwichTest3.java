/*
 * 작성일 : 2024년 3월 26일

 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 조건식 연습.
 * 		 숫자와 연산자를 입력 받아
 * 		 사칙연산 프로그램을 작성하시오.
 * 		 입력 방식 : 3 + 4(띄어쓰기로 구분)
 * 
 * 문제분석 :  입력 받아야 할 값은
 * 			1,2,3,4,5,6,7,8,9,10,11,12이다.
 * 			0이나 13을 입력하면? => 해당 월은 없습니다 출력.
 * 
 * 			다중 if ?
 * 			내포된 if?
 * 
 * 알고리즘 :   1. 점수(정수)를 입력받는다.
 * 			 2. if 점수의 범위가 0~100 사이인가?
 * 				1) A
 * 				2) B
 * 				   :
 * 			 3. else 아닌가?
 * 				3-1 "잘못된 점수입니다." 출력
 * 			
 */

import java.util.Scanner;

public class SwichTest3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = stdIn.nextInt();
		char oparator = scan.next().charAt(0);
		System.out.print("두 번째 정수 입력 : ");
		int num2 = stdIn.nextInt();
		
		switch(oparator)
		{
		case  '+':
			System.out.println(num1 +  oparator +  num2 + "=" +(num1 + num2));
			break;
		case  '-':
			System.out.println(num1 + oparator  + num2 + "=" +(num1 - num2));
			break;
		case  '*':
			System.out.println(num1 + oparator +  num2 + "=" +(num1 * num2));
			break;
		case  '/':
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(num1 + oparator + num2 + "=" +(num1 / num2));
			}
			break;
		}

	}

}
