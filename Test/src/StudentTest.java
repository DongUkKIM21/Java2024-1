/*
 * 작성일 : 2024년 6월 4일
 * 작성자 : 컴퓨터소프트웨어공학부 202195005 김동욱
 * 
 * Person 클래스를 작성하시오.
 * 이 클래스는 다음과 같은 속성을 가집니다.
 * String name
 * 
 * Person 클래스는 다음과 같은 메소드를 가집니다.
 * 기본 생성자 : 이름을 "홍길동"으로 초기화 합니다.
 * 매개변수 생성자: 이름을 입력받아 초기화홥니다.
 * printInfo() 메소드: 사람의 이름을 출력합니다.
 * 
 * Person 클래스를 상속하는 Student클래스를 작성하세요.
 * 이 클래스는 다음과 같은 속성을 추가로 가집니다.
 * String major
 * 
 * Student 클래스는 다음과 같은 메소드를 가집니다.
 * 기본 생성자: 부모 클래스의 기본 생성자를 호출하고, major를 "기계공학과"로 초기화 합니다.
 * 매개변수 생성자: 이름과 전공을 입력받아 초기화합니다.
 * printInfo() 메소드: 부모 클래스의 printInfo() 메소드를 호출하고, 전공을 추가로 출력합니다.
 * 
 * [출력결과]
 * 이름을 입력하시오. : 김동욱
 * 전공을 입력하시오. : 컴퓨터공학부
 * 
 * 이름 : 김동욱
 * 학과 : 컴퓨터공학부
 */

import java.util.Scanner;

class Person {
	String name;
	public Person() {
		name = "홍길동";
	}
	public Person(String name) {
		this.name = name;
	}
	public void printInfo() {
		System.out.println("이름 : " + name);
	}	
	
}
class Student extends Person{
	String major;
	public Student() {
		super();
		major = "기계공학과";
	}
	public Student(String name,String major) {
		super(name);
		this.major = major;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("학과 : " + major);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오. : ");
		String name = stdIn.nextLine();
		
		System.out.println("전공을 입력하시오. : ");
		String major = stdIn.nextLine();
		
		Student std = new Student(name,major);
		std.printInfo();
	}

}
