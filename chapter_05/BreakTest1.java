/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 1부터 입력 받은 수까지의 합을 출력하시오.
 */
package chapter_05;

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = stdIn.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			
		}
		System.out.println("1부터" + num + "까지 합은 :" + sum + "입니다.");
	}

}
