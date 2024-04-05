/*
 * 정수를 입력하시오 : 5
 * 
 *★
 *★★
 *★★★
 *★★★★
 *★★★★★ 
 */
package chapter_05;

import java.util.Scanner;

public class nestedLoopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int num = scan.nextInt();
		
		for(int i=1; num >= i; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
