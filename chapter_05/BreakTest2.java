/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명 : 1부터 입력 받은 수까지의 합을 출력하시오.
 */
package chapter_05;

public class BreakTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		for (i =1; i < 10; i++) 
		{
			for(j = 1; j < i; j++) 
			{
				if(j > 6) {
					break;
				}
				System.out.print("♥ ");
			}
			System.out.println();
		}

	}

}
