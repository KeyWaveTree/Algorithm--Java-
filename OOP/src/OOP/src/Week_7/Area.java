package OOP.src.Week_7;

import java.util.Scanner;

class Shape {
    protected String name;
    protected double area;

    public void getArea() {
        System.out.printf("%s의 넓이: %.2f\n", name, area);
    }
}


// 주석은 지우고 제출하세요!

// 여기에 Shape을 상속한 Circle, Rectangle Class 작성, 작성시 super 사용 필수

// 1. Circle Class - 넓이 구할때 pi 대신 3.14 사용
// 	1) private 변수: radius 사용
// 	2) 생성자
// 	3) public void getArea()를 메소드 오버라이딩 하기

class Circle extends Shape
{
    private double radius;

    Circle()
    {
        super();
        super.name  = "Circle";
        super.area = 0;
    }

    public void set(double radius)
    {
        super.name  = "Circle";
        this.radius = radius;
        super.area = this.radius * this.radius *3.14;
    }

    public void getArea()
    {
        System.out.printf("%s의 넓이: %.2f\n", this.name, this.area);
    }
}

// 2. Rectangle Class
// 	1) private 변수: length, width 사용
// 	2) 생성자
// 	3) public void getArea()를 메소드 오버라이딩 하기
class Rectangle extends Shape
{
    private double length;
    private double width;
    Rectangle()
    {
        super();
        this.length = 0;
        this.width=0;
        super.name = "Rectangle";
        super.area = width*length;
    }

    public void set(double length, double width)
    {
        this.length = length;
        this.width = width;
        super.name = "Rectangle";
        super.area = width*length;
    }
}

public class Area {
    public static void main(String[] args) {
        // 여기에 코드 작성
        // 3개의 Circle과 radius 혹은 Rectangle과 length, width를 입력받아 넓이를 출력하시오.
        // 입력 값에 음수 없음
        // 넓이는 반올림하여 소수점 둘째자리까지 출력
        // 모든 테스트케이스는 Circle 혹은 Rectangle로 구성, break는 없습니다.
        Scanner scan = new Scanner(System.in);
        Circle circle;
        Rectangle ract;
        String circleName;
        int width, height;
        int radius;

        for (int i = 0; i < 3; i++)
        {
            circleName = scan.next();
            if(circleName.equals("Circle"))
            {
                radius = scan.nextInt();
                circle = new Circle();
                circle.set(radius);
                circle.getArea();
            }
            else if(circleName.equals("Rectangle"))
            {
                width = scan.nextInt();
                height =scan.nextInt();
                ract = new Rectangle();
                ract.set(height, width);
                ract.getArea();
            }
        }
    }
}