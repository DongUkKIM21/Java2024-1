/*
 * 작성일 : 2024년 4월 05일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 조건식 연습
 *      월을 입력받아 해당 계절을 출력하시오.
 *      3,4,5월 => 봄
 *      6,7,8월 => 여름
 *      9,10,11월 => 가을
 *      12,1,2월 => 겨울
 *
 * 문제 분석 : 입력 받아야 할 값은
 *          1,2,3,4,5,6,7,8,9,10,11,12 이다.
 *          0이나 13을 입력하면? => 해당 월은 없습니다. 출력하기
 * 
 *          switch ~ case 문 사용
 */

package chapter_05;

import java.util.Scanner;

public class doWhileTest2 {

   public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      
      // 1. 정수를 입력 받는다.
      int month = 0;
      do {
         System.out.print("월을 입력하시오(종료:0) : ");
         month = stdIn.nextInt();
         if (month ==0) {
            System.out.println("종료하겠습니다.");
            break;
         }
         switch (month) {
         case 3 : case 4 : case 5 :
            System.out.println("봄 입니다.");
            break;
         case 6 : case 7 : case 8 :
            System.out.println("여름 입니다.");
            break;
         case 9 : case 10: case 11:
            System.out.println("가을 입니다.");
            break;
         case 12 : case 1 : case 2 :
            System.out.println("겨울 입니다.");
            break;
         }
      }while (month != 0);
   }
}