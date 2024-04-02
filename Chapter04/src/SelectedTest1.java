/*
 * 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다.
 * 		홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		세자리 수 : 100 ~ 999
 * 		123을 입력했을 때 
 * 		백의 자리 수는 홀수 십의 자리 수는 짝수 일의 자리 수는 홀수 
 * 
 * 		100의 자리, 10의 자리, 1의 자리를 구분해야 한다.
 * 		힌트) 나누기와 나머지 연산자를 활용한다.
 * 
 * [알고리즘]
 * 		1. 정수 입력 받기.
 * 		2. 3자리 수 맞는지 확인
 * 		3. 아니면?
 * 		3. 백의 자리 확인 100 나누기
 * 		4. 십의 자리 확인 100 나눈 나머지 에서 10 나누기.
 */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num = stdIn.nextInt();
		int hundred = num / 100 ; 	// 100의 자리 몫 찾기
		int ten = (num % 100) /10 ; // 10의 자리 몫 찾기
		int one = (num % 100) % 10; // 1의 자리 몫 찾기
		
		if (num >= 100 && num <= 999)
		{
			if(hundred % 2 == 0){
				System.out.println("백의 자리 수는 짝수 입니다");
			}else {
				System.out.println("백의 자리 수는 홀수 입니다");
			}if(ten % 2 == 0) {
				System.out.println("십의 자리 수는 짝수 입니다.");
			}else {
				System.out.println("십의 자리 수는 홀수 입니다.");
			}
			if(one % 2 == 0) {
				System.out.println("일의 자리 수는 짝수 입니다.");
			}else {
				System.out.println("일의 자리 수는 홀수 입니다.");
			}
		}else {
			System.out.println("3의 자리 수가 아닙니다.");
		}
	}

	

}
