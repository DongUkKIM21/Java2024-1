/*
 * 작성일 : 2024.04.02
 * 작성자 : 202195005 컴소부 김동욱
 * 설명 : 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오. 
 * 
 * 문제분석 :  5! = 5 * 4 * 3 * 2 * 1 => 120
 * 
 * 알고리즘 : 
 * 		1. 숫자를 입력 받는다.(정수)
 * 		2. 곱하는 수는 입력 받은 숫자부터(초기값)
 * 		3. 곱하는 수는 입력 받은 숫자에서 1씩 감소(조건식)
 * 			3-1. 출력한다.
 * 			3-2. 곱하는 수를 1씩 감소한다.(감소식)
 * 			
 */
package chapter_05;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
				Scanner stdIn= new Scanner(System.in);
				
				// 1.단을 입력 받는다. 
				System.out.print("숫자를 입력하세요 : ");
				int num = stdIn.nextInt();
				
				int fac = 1;
				
				while(num >= 1) {
					fac = fac * num;
					
					num--;
				}
				System.out.println(num + " != " + fac);
				
				

	}

}
