class Car{
	String name, color;	//전역변수
    int speed;

    public Car(String name){
       this.name = name;	
    }

    public Car(String name, String color){
       this.name = name;
       this.color = color;
    }

    public Car(String name, String color, int speed){	
       this.name = name;
       this.color = color;
       this.speed = speed;
    }
    public void printCar(){	//출력
       System.out.println("이름 = "+name+", 색깔 = "+color+", 속도 = "+speed);
    }
}

public class CarTest {
    public static void main(String args[]){
       Car so = new Car("제네시스","검정",240); //객체 생성
       so.printCar();
       Car ti = new Car("BMW","빨강",200);	//객체 생성
       ti.printCar();
    }
}