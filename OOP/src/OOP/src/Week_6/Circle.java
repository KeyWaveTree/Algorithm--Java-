package OOP.src.Week_6;

import java.io.*;
import java.util.*;

class Calc {
    // static 함수 두개 선언 1) abs(double a) 2) getArea(double radius)
    // 1. abs(double a) 함수 작성

    static double abs(double a)
    {
        if(a<0) a*=-1;
        return a;
    }
    // 2. Circle 클래스의 PI를 사용하여 Circle의 넓이를 구하는 getArea(double radius)함수 작성
    static double getArea(double radius)
    {
        return Circle.PI * radius * radius;
    }

}

public class Circle {
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
        this.area = Calc.getArea(radius);
    }

    public double getThisArea() {
        return this.area;
    }

    public static void main(String[] args) {
        // 크기가 3인 Circle 객체 배열 c 선언 후 이름이 Circle이고 radius가 0인 객체로 초기화
        Scanner scan = new Scanner(System.in);
        Circle[] circle = new Circle[3];
        for (int i = 0; i < circle.length; i++) {
            String name = scan.next();

            if (name.equals("Circle")) {
                int j = scan.nextInt();
                circle[i] = new Circle(name, j);
            } else if (name.equals("Break")) {
                for (int j = i; j < circle.length; j++) circle[j] = new Circle();
                break;
            }
        }


        for (int i = 0; i < circle.length; i++) {
            String area = String.format("%.2f", circle[i].getThisArea());
            System.out.println("Circle의 넓이: " + area);
        }
    }
}