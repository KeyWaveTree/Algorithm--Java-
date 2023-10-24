package OOP.src.Week_4_5;

import java.io.*;
import java.util.*;

public class Car{
    String carName;
    int carYear;
    int maxSpeed;
    String carColor;

    public Car(){
        carName = "car"; carYear = 0; maxSpeed = 0; carColor = "black";
    }
    public Car(String carName, int carYear, int maxSpeed, String carColor){
        this.carName = carName; this.carYear = carYear; this.maxSpeed = maxSpeed; this.carColor = carColor;

    }

    public String getCarName(){
        return this.carName;
    }

    public int getCarYear(){
        return this.carYear;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public String getCarColor(){
        return this.carColor;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed += maxSpeed;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Car [] c = new Car[5];
        int count = 0;
        int i=-1;
        String command = null;

        while(true)
        {
            // carName = "car"
            // , carYear = 0, maxSpeed = 0, carColor = "black"으로 초기화
            // 여기에 코드 작성
            command= scanner.next();
            if(command.equals("new"))
            {
                i++;
                c[i] = new Car(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());

            }
            else if(command.equals("setspeed"))
            {
                int n = scanner.nextInt();
                int set = scanner.nextInt();
                c[n].setMaxSpeed(set);
            }
            if(i == c.length-1) break;

        }
        for(i=0;i<c.length;i++)
        {
            System.out.println(c[i].getCarYear() +"년 된 "+c[i].getCarColor() +" 색상의 "+c[i].getCarName()+
                    " 차량의 최고 속도는 "+c[i].getMaxSpeed()+ " 입니다.");
        }
    }
}