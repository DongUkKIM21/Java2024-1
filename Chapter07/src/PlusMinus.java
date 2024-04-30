/*
 * 작성일 : 2024년 4월 30일
 * 
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 
 * 설명 : PlusMinus 클래스 생성.
 * 		더하기, 빼기, 게산하는 기능이 있다.
 * 
 */
public class PlusMinus {
	//속성 정의
	//변수 생성
	int plus, minus;
	
	//기능(메소드) 정의
	//plus 기능
	//2개의 정수형 값을 전달 받아 한계를 구한 값을 돌려준다.
	public String plus(int x, int y) {
		plus = x + y;
		return "두 수의 합은 " + plus;
	}
	
	// minus 기능
	public String minus(int x, int y) {
		plus = x - y;
		return "두 수의 차는 " + minus;
	}
}
