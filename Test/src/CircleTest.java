/*
 * 작성일 : 2024년 3월 22일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 
 * shape 클래스를 작성하고 이를 상속받는 Circle 클래스를 작성하세요.
 * 
 * Shape 클래스에는 String color 속성을 추가하고, 이를 설정하는 생성자를 작성합니다.
 * Circle 클래스에는 String color 속성을 추가하고, 이를 설정하는 생성자를 작성합니다.
 * Circle 클래스는 Shape 클래스를 상속받고, double radius 속성을 추가하여 이를 설정하는 생성자를 작성합니다.
 * Circle 클래스에 원의 면적과 둘레를 계산하는 메소드를 작성합니다.
 * 
 * [출력결과]
 * 원의 색상을 입력하세요 : 빨강
 * 원의 반지름을 입력하세요 : 
 * 
 *  원의 색상 : 빨강
 *  원의 반지름 : 3.0
 *  원의 면적 : 28.26
 *  원의 둘레 : 18.84
 */

import java.util.Scanner;

class Shape{
	String color;
	public Shape(String color) {
		this.color = color;
	}
	public void printInfo() {
		System.out.println("원의 색상은 : " + color);
	}
}
class Circle extends Shape{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("원의 반지름 : " + radius);
	    System.out.println("원의 면적 : " + radius * radius * 3.14);
	    System.out.println("원의 둘레 : " + 2 * radius * 3.14);

	}
}
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner std = new Scanner(System.in);
		
		System.out.println("원의 색상을 입력하세요 : ");
		String color = std.nextLine();
		
		System.out.println("원의 반지름을 입력하세요 : ");
		double radius = std.nextDouble();
		
		Circle circle = new Circle(color, radius);
		circle.printInfo();

	}

}
