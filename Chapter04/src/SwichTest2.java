/*
 * 작성일 : 2024년 3월 26일

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

public class SwichTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
			
		System.out.print("월을 입력하세요 : ");
		String month = stdIn.next();
		String MtoS;
		switch(month) 
		{
			case "December" :
			case "January" :
			case "February":
				MtoS = "겨울입니다";
				break;
			case "March" : 
			case "April" :
			case "May" :
				MtoS = "봄입니다";
				break;
			case "June" :
			case "July" :
			case "Agust" : 
				MtoS = "여름입니다";
				break;
			case "September" :
				MtoS = "멋진 9월과 " ;
			case "October" :
				MtoS = "아름다운 10월과 " ;
			case "November" :
				MtoS = "낙엽의 11월은 " ;
				break;
			default :
				MtoS ="1~12월을 벗어난 달입니다.";
				break;
		}
		System.out.println(MtoS);
	}

}
