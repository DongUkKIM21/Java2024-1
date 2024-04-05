/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 1부터 10까지의 합을 출력하시오.
 */
package chapter_05;

public class doWhile {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		do {
			sum = sum + num;
			num++;
		}
		while(num <= 10);
			System.out.println("1에서 10까지의 합은 "+ sum + "입니다.");
		

	}

}
