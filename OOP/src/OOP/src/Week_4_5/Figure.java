package OOP.src.Week_4_5;

import java.io.*;
import java.util.*;

public class Figure {
    String name;
    double radius;
    double length;
    double width;
    double area;

    public Figure(String name, double radius) {
        this.name = name;
        this.radius = radius;
        this.length= 0;
        this.width=0;
        this.area=radius * radius *3.141592;
    }

    public Figure(String name, double length, double width) {
        this.name = name;
        this.radius = 0;
        this.length= length;
        this.width=width;
        this.area= length * width;
    }

    public void getArea(double radius) {
        System.out.printf("Circle의 넓이 : %.2f\n", radius *radius *3.141592);
    }
    public void getArea(double length, double width) {
        System.out.printf("Rectangle의 넓이 : %.2f\n", length *width);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Figure[] fi = new Figure[4];
        String name;
        double r=0;
        double w=0;
        double h=0;
        int i;
        for(i=0;i<fi.length;i++)
        {
            name = scan.next();
            if(name.equals("Circle")) {
                r = scan.nextDouble();
                fi[i] = new Figure(name, r);
                fi[i].getArea(r);
            }
            else if(name.equals("Rectangle"))
            {
                w = scan.nextDouble();
                h = scan.nextDouble();
                fi[i]= new Figure(name, w, h);
                fi[i].getArea(w, h);
            }
        }
    }
}