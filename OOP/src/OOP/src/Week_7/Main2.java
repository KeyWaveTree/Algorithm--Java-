package OOP.src.Week_7;

import java.io.*;
import java.util.*;


class Point
{
    protected int x, y;

    Point()
    {
        this.x =0;
        this.y=0;
    }
    Point(int x, int y)
    {
        this.x = x;
        this.y =y;
    }

    public double dist(Point a, Point b)
    {
        return Math.sqrt((int)Math.pow((b.x - a.x), 2)+ (int)Math.pow((b.y - a.y), 2));
    }
}
// 2. Polygon Class - Point Class 상속, super 사용 필수
// 	1) 기본생성자 상속
// 	2) public double getPerimeter(...): 둘레를 구하는 함수
// 		-> Point Class의 dist를 이용하여 구하기
// 	3) public double getArea(...): 넓이를 구하는 함수

class Polygon extends Point
{
    Polygon()
    {
        super();
    }
    Polygon(int x, int y)
    {
        super(x, y);
    }

    public double getPerimeter(Point arr[])
    {
        double sum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            sum+=super.dist(arr[i%(arr.length-1)], arr[(i+1)%(arr.length-1)]);
        }

        return sum;
    }

    public double getArea(Point arr[])
    {
        int sum1=0, sum2=0;
        for(int i=0;i<arr.length-1;i++)
        {
            sum1+=arr[i%(arr.length-1)].x * arr[(i+1)%(arr.length-1)].y;
            sum2+=arr[(i+1)%(arr.length-1)].x *arr[i%(arr.length-1)].y;
        }

        return Math.abs(sum1 -sum2)/2.0;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Point[] points = new Point[n+1];
        Polygon p = new Polygon();
        for(int i=0;i<n;i++)
        {
            int a, b;
            a=scan.nextInt();
            b=scan.nextInt();
            points[i] = new Point(a, b);
        }

        System.out.printf("%.2f\n",p.getPerimeter(points));
        System.out.printf("%.2f",p.getArea(points));
    }
}
