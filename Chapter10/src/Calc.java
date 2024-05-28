
import java.util.Scanner;

class Calculator  {
	private int num1, num2;	//숫자와 연산자 초기화 선언.
	private String op;
	private int result;
	
	public int getResult() {	//private 출력 메소드
		return result;
	}

	public Calculator(int num1, int num2, String op) {	// 객체 불러오기.
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public void calc() {
		
		switch(op) {							//사칙연산 switch
		case "+": result = num1+num2;break;
		case "-": result = num1-num2;break;
		case "*": result = num1*num2;break;
		case "/": result = num1/num2;
		}
	}
}

public class Calc {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // 키보드 입력을 위해 Scanner 객체 생성
		System.out.print("첫번째 정수를 입력하시오. : ");
		int num1 = stdIn.nextInt();
		System.out.print("두번째 정수를 입력하시오. : ");
		int num2 = stdIn.nextInt();
		System.out.print("연산자를 입력하시오. : ");
		String op = stdIn.next();

		Calculator calc = new Calculator(num1, num2, op);
		calc.calc();	//객체 불러오기
		System.out.println("연산결과 : " + calc.getResult());	//출력하기
	}
}