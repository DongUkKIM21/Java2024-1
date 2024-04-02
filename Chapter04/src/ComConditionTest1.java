/*
 * 작성일 : 2024년 3월 22일

 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 조건식 연습.
 * 		 월을 입력 받아 해당 계절을 출력하시오.
 * 		 3,4,5월 => 봄
 * 		 6,7,8월 => 여름
 * 		 9,10,11월 => 가을
 * 		 12,1,2월 => 겨울
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

public class ComConditionTest1 {

	public static void main(String[] args) {
		System.out.print("달을 입력하세요 : ");
		Scanner stdIn = new Scanner(System.in);
		
		int month = stdIn.nextInt();
		if(month >= 1 && month <= 12){
			if(month >= 3 && month <= 12){
				System.out.println("봄입니다.");
			}
			else if(month >= 4 && month <= 8) {
				System.out.println("여름입니다.");
			}
			else if(month >= 9 && month <= 11) {
				System.out.println("가을입니다.");
			}
			else{
				System.out.println("겨울입니다.");
			}
		}
		else {
			System.out.println("해당 월은 없습니다.");
		}

	}

}
