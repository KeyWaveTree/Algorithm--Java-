package OOP.src.Assignment;
import java.io.*;
import java.util.*;

class Calc {
    // static 함수 두개 선언 1) abs(double a) 2) getArea(double radius)
    // 1. abs(double a) 함수 작성
    static double abs(double a){
        return a < 0 ? -a : a;
    }
    // 2. Circle 클래스의 PI를 사용하여 Circle의 넓이를 구하는 getArea(double radius)함수 작성
    static double getArea(double radius){
        return Circle.PI * radius * radius;
    }
}

class Circle {
    // final 변수 PI = 3.14 선언
    final static double PI = 3.14;
    String name;
    double radius;
    double area;

    public Circle() {
        this.name = "Circle";
        this.radius = 0;
        this.area = 0;
    }

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = Calc.abs(radius);
        this.area = 0;
    }

    public String toString(){
        this.area = Calc.getArea(this.radius);
        return String.format("%s의 넓이: %.2f", this.name, this.area);
    }

    public static void main(String[] args) {
        // 크기가 3인 Circle 객체 배열 c 선언 후 이름이 Circle이고 radius가 0인 객체로 초기화
        Circle[] c = new Circle[3];
        for (int i = 0; i < 3; i++){
            c[i] = new Circle();
        }

        Scanner in = new Scanner(System.in);
        String circleName;
        for (int i = 0; i < 3; i++) {
            circleName = in.next();
            if (circleName.equals("Break"))
                break;

            c[i].name = circleName;
            c[i].radius = in.nextDouble();
        }

        for (int i = 0; i < 3; i++)
            System.out.println(c[i]);
    }
}