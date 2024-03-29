/*
 * 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고,
 * 그렇지 않고두 수중 하나로도 홀수이면 몇 번째 입력한 수를 짝수로 
 * 입력해야 하는지 출력하시오.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다
 * 		홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		두 수가 짝수면 더하기
 * 		두 수중에 하나라도 홀수면 몇 번째 수를 짝수로 바껴야 되는지 출력
 *      첫 번째 숫자가 홀수이고 두 번째 숫자가 짝수이면 첫 번째 수는 홀수라고 출력
 *      두 번째 숫자가 홀수이고 첫 번째 숫자가 짝수이면 두 번째 수는 홀수하라고 출력
 *      둘 다 홀수면 두 개의 숫자 다 짝수가 아니라고 출력
 * 
 * [알고리즘]
 * 		1. 정수 2개 입력받기
 * 		2. 만약 두 수가 모두 짝수이면 더한다. 
 * 		3. 아니면 첫 번째 숫자가 홀수이고 두 번째 숫자가 짝수이면
 * 			3-1.첫 번째 수는 짝수가 아닙니다
 * 		4. 아니면 두 번째 숫자가 홀수이고 첫 번째 숫자가 짝수이면
 * 			4-1.두 번째 수는 짝수가 아닙니다. 출력
 * 		5. 아니면
 * 			5-1. 두 수는 모두 짝수가 아닙니다. 출력  

 */

import java.util.Scanner;

public class SelectiveTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 =stdIn.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = stdIn.nextInt();
		
		int num1_op = num1 % 2;
		int num2_op = num2 % 2;
		int sum = num1 + num2;
	
		
		if(num1_op == 0 && num2_op == 0) {
			System.out.println(num1 + "+" + num2 + "=" + sum);
		}else if(num1_op == 1 && num2_op == 0) {
			System.out.println("첫 번째 숫자는 짝수가 아닙니다.");
		}else if(num1_op == 0 && num2_op == 1) {
			System.out.println("두 번째 숫자는 짝수가 아닙니다.");
		}else {
			System.out.println("두 수는 짝수가 아닙니다.");
		}

	}

}
