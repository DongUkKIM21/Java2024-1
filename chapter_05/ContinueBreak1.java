/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 점수를 입력 받아서 함계와 평군을 출력하시오.
 * 		음수가 입력되면 점수 입력이 종료됩니다.
 * 		100점 이상의 점수는 계산에 포함되지 않습니다.
 * 
 * 문제 분석 : 
 * 			계속해서 점수를 입력 받습니다.(무한 반복)
 * 			점수 입력 받아 101이상이면 다시 입력받고 반복문 다시 시작.
 * 			만약 100이하 0이상이면 합계와 카운트를 계산.
 * 			음수이면 종료.
 * 			합계 받은 거를 카운트 받은 거와 나눠서 평균 구함.
 * 			출력.
 * 
 * 알고리즘 : 
 * 			1) 정수 sum(합계), avg(평균값), count(카운트) 초기값 주기.
 * 			2) while 사용해 무한반복하기.
 * 				2-1) 만약 101이상이면 다시 입력받기.
 * 				2-2) 만약 입력받은 수가 0보다 크면
 * 					2-3) 더하기
 * 					2-4) 카운트 해주기.
 * 						2-5)아니면 종료.
 * 			3) 합계 받은거 카은트 변수에 저장 되어 있는 수로 평균 구하기
 * 			4) 출력.
 * 		
 */
package chapter_05;

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		a: while(true) {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("점수를 입력하세요 : ");
			int input_num = stdIn.nextInt();
			if(input_num > 100) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			if(input_num > 0) {
				sum += input_num;
				count++;
				
			}else {
				System.out.println("취소합니다.");
				break a;
			}
			
			
		}
		avg = (sum /count);
		System.out.println("합계 : " +sum + "평균 : " +avg  + "입니다.");
		

	}

}
