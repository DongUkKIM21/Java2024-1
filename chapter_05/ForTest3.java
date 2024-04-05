/*
 * 작성일 : 2024.04.05
 * 작성자 : 202195005 컴소부 김동욱
 * 설명 : 정수를 입력 받아 그 수의 약수를 구하시오. 
 * 
 * 문제분석 : 약수는 어떤 수를 나머지 없이 나눌 수 있는 자연수입니다.
 * 
 * 알고리즘 : 
 * 		1. 숫자를 입력 받는다.(정수)
 * 		2. 입력 받은 수가 0이 될 때 까지 계속 나눈다(초기값)(조건식)(증감식)
 * 			2-1. 2로 안 나눠질 경우 다음 숫자로 넘어가 나눈다
 * 			
 */
package chapter_05;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		for(int i = 1; num >= i ; i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
				
		}
	}

}
