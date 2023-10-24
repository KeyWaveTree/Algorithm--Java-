package OOP.src.Week_1;

import java.util.Scanner;

public class Week_1 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Calculator cal = new Calculator();
            int a = scan.nextInt();
            int b = scan.nextInt();

            while(true){
                try
                {
                    int c=cal.div(a, b);
                    System.out.println(a + " + " + b + " = " + cal.sum(a, b));
                    System.out.println(a + " - " + b + " = " + cal.sub(a, b));
                    System.out.println(a + " * " + b + " = " + cal.mul(a, b));
                    System.out.println(a + " / " + b + " = " + cal.div(a, b));
                    break;
                }
                catch(ArithmeticException e1) {
                    System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
                    a = scan.nextInt();
                    b = scan.nextInt();
                }
            }
        }
    }

