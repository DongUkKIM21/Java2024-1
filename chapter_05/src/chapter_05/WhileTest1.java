/*
 * 작성일 : 2024.04.02
 * 작성자 : 202195005 컴소부 김동욱
 * 설명 : 1부터 10까지 합을 출력하시오.
 * 
 * 문제분석 :  1+2+3+4+5+6+7+8+9+10
 * 		    1부터(초기값)
 * 			10까지(조건식)
 * 			1씩 증가(증감식)
 * 			하면서 합계를 계산한다.
 * 			sum = sum += num 공식
 * 			sum = 0 초기값 지정이 반드시 필요하다.
 * 
 * 알고리즘 : 
 * 		0. sum = 0 으로 초기값 지정.
 * 		1. 수는 1부터(초기값)
 * 		2. 수는 10까지 반복하면서(조건식)
 * 			2-1. 합계를 계산한다.
 * 			2-2. 수를 1씩 증가한다.
 * 			2-3. 합계를 출력한다.(증감식)
 * 		3. 합계를 출력한다.
 */

package chapter_05;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int num = 1;
		
		while(num <= 10) {
			sum+=num;
			num++;
			System.out.println("1에서 10까지의 합은 : " + sum + "입니다");
		}
	
		
		

	}

}
