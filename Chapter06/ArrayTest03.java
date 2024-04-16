/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명  : 1차원 배열에 정수 값을 저장하여 생성하시오.
 * 		 사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 * 		 입력한 값이 배열에 없다면 "입력한 값이 없습니다."를 출력하시오.
 * 
 * 문제 분석 : 사용자가 입력한 값이랑 배열에 있는 값을 확인한다. 그 값이 있으면 카운터를 증가 시키면서 그 값을 저장시켜준다
 * 			사용자가 입력한 수가 없으면 없다고 출력해준다.
 * 
 * 알고리즘 : 
 * 			1. 정수 입력받기
 * 			2. 배열 숫자 넣어주기.
 * 			3. 입력 받은 수만큼 반복 해주기.
 * 				3-1. 만약 입력 받은 수와 배열에 있는 수가 맞으면 카운트 증가 배열 출력.
 * 				
 * 			4. 만약 카운터가 0이면 입력한 값 없음 출력.
 * 				4-1. 아니면 숫자 출력.
 *  
 */
package chapter_05;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn= new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int input_num = stdIn.nextInt();
		int count = 0;
		System.out.println(input_num );
		
		int num[] = {10,12,48,78,97,21,42,1,4,8,3,5,54,64,11,77,1,10};
		
		for(int i = 0; i < num.length; i++) {
			if(input_num == num[i]) {
				++count;
				System.out.println("num[" + i + "]");
			}
		}
		if(count ==0) {
			System.out.println("입력한 값이 없습니다");
		}
		else{
			System.out.println(input_num + "은 " + "총 " + count + "개 있습니다." );
		}

	}

}
