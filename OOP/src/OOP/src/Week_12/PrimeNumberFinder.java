package OOP.src.Week_12;
import java.io.*;
import java.util.*;

public class PrimeNumberFinder implements Runnable {
    // 필요한 코드 작성. 주어진 뼈대 코드는 수정하지 말 것
    private final int n;
    private boolean check;
    protected PrimeNumberFinder()
    {
        this.n =0;
        this.check = true;
    }
    protected PrimeNumberFinder(int n)
    {
        this.n = n;
        this.check = true;
    }

    @Override
    public void run() {

        for (int i=2;i<n;i++)
        {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if(check)
        {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args)
    {
        // 메인 함수 작성
        Scanner scan = new Scanner(System.in);
        PrimeNumberFinder pnf;
        int in = scan.nextInt();

        for(int i=2;i<=in;i++)
        {
             pnf = new PrimeNumberFinder(i);
             pnf.run();
        }
    }
}
