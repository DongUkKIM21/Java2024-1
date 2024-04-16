/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 * 		사용자로 부터 
 */
package chapter_05;

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn= new Scanner(System.in);
		
		int num[] = new int[5];
		int i, sum = 0;
		
		double avg;
		
		System.out.println("배열의 길이 : " + num.length);
		
		System.out.println("배열에 저장된 초기값");
		for(i = 0; i < 5; i++) {
			System.out.println("num[" + i + "]" + num[i]);
		}
		System.out.println("배열의 길이 : " + num.length);
		
		
		
		System.out.println("사용자로부터 값 입력 받아 배열에 저장");
		for(i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "]" + num[i]);
			System.out.print("정수를 입력하세요 : ");
			num[i] = stdIn.nextInt();
		}
		
		//배열에 저장된 값들의 합과 총점 계산하여 출력
		for(i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		avg = (double)sum / num.length;
		System.out.println("합은 : " + sum + "평균은 : " + avg);

	}

}
