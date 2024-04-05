/*
 * 전체 구구단 작성하기
 * 
 *[문제 분석] 
 *		단은 2~9까지
 *		곱하는 수는 1~9
 *		2단 출력하고, 3단 출력하고, .... 9단 출력한다.
 *
 * [알고리즘]
 * 	 -----for-----
 * 		1. 단은 2부터 9까지 반복한다.
 * 			== 0단 출력 ==
 * 			1-1. 곱하는 수는 1부터 9까지 반복한다.
 * 				1-1-1. 구구단을 출력한다.
 * 
 * 	-----while-----
 * 		1. 단은 2단부터
 * 		2. 단은 9단까지 반복
 * 			== 0단 출력 ==
 * 			2-1. 수는 1부터
 * 			2-2. 단은 9단까지 반복
 * 				2-2-1. 구구딘 츨략힌다
 * 				2-2-2. 수를 1증가 시킨다
 * 			2-3. 단을 1 증가시킨다.
 * 
 * 
 */
package chapter_05;

public class nestedLoopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub>
		for(int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"단 출력 : " + i +" * "+ j + " = " + i*j);
			}
		}

	}

}
