package OOP.src.Week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Multible_Set {
    public static void main(String[] args) {
        //프로그래머스 최고의 집합 문제
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //원소 개수의 총 크기
        int S = scan.nextInt(); //중복 집합의 합
        int[] arr = new int[n];

        //최대합이 원소 개수보다 작으면 문제자체가 성립이 안되므로(리스트를 만들 수 없음) -1 return
        if(n > S) System.out.println(-1);
        //성립이 안되는 경우를 제외하고
        else
        {
            //원소간의 차이가 최소화된 집합이 원소의 곱에서 최대가 된다.
            for(int i=0;i<arr.length + (S%n);i++)
            {
                //값을 다 초기화 하지 않았다면
                if(i< arr.length)
                {
                    //값을 균등하게 분배 - 초기화
                    arr[i] = S / n;
                }
                //이외 나머지는 남은 수만큼 증가
                else
                {
                    //0~나머지 만큼(S%n) 증가
                    arr[i%arr.length]++;
                }
            }

            //정렬한 뒤 출력
            Arrays.sort(arr);
            for(int value: arr) System.out.print(value+" ");
        }
    }

}
