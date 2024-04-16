/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 설명  : 배열에 저장된 값 중 최대값과 최소값을 출력하시오. 
 * 
 * 최대값, 최소값
 * 반드시 비교 대상 필요.
 * {34,23,56,12,77}
 * 
 * 첫번째 값을 기준으로 비교한다 => 0번지에 저장된 값을 기준으로 한다.
 * 비교하여 큰 값은 max변수에 저장한다.
 * 작은 값은 min변수에 저장한다.
 * 
 * 비교 대상인 0번지 값을 바교 할 필요가 없다.
 * 반복은 1번지부터 하면 된다.
 *  
 */
package chapter_05;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {34,23,56,12,77,9};
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max + "최소값 : " + min);

		max = num[0];
		min = num[0];
		
		System.out.println("확장된 for 문");
		
		for(int j : num) { //num배열에 저장된 값을 차례대로 j에 저장하여 실행.
			if(max < j) {
				max = j;
			}
			if(min > j) {
				min = j;
			}
		}
		System.out.println("최대값 : " + max + "최소값 : " + min);
	}
		
}
