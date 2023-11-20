package OOP.src.Week_10;

import java.io.*;
import java.util.*;

public class Linked_List_Main
{
    public static void main(String[] args) throws IOException
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            int n = scan.nextInt();
            if(n==-1) break;
            else if(n<0)
            {
                System.out.println("0보다 큰 숫자를 입력하세요.");
                continue;
            }
            else if(n>=1000000)
            {
                System.out.println("1000000보다 작은 숫자를 입력하세요.");
                continue;
            }
            linkedList.addFirst(n);
        }
        System.out.println("Reversed list: "+linkedList);
    /*
    LinkedList 선언: LinkedList<Integer> list = new LinkedList<>();
    - 0보다 크고, 1000000보다 작은 숫자를 입력받아 LinkedList에 저장한다.
    - -1이 입력되면 입력을 종료한다. 이때 -2, -3 등 -1보다 작은 수가 입력될 수도 있다.
    - 프로그램이 종료되면 LinkedList의 모든 요소를 역순으로 출력한다.
    */
    }


}
