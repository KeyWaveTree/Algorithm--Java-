package OOP.src.Week_6;

import java.util.Arrays;
import java.util.Scanner;

class Result
{
    private int result = 0;
    private int point_A = 0;
    private int point_B = 0;
    private boolean flag; //팀이 매칭 되었다면 패스
    Result()
    {
        this.result=0;
        this.point_A=0;
        this.point_B=0;
        this.flag = true;
    }

    public void updateIndex_A(int arr_value){
        this.point_A = arr_value;
    }

    public void updateIndex_B(int arr_value){
        this.point_B =arr_value;
    }

    public void updateResult(int value){
        this.result = value;
    }

    public boolean getFlag()
    {
        return this.flag;
    }

    public void setFlag(boolean tof)
    {
        this.flag = tof;
    }
    public int getPoint_A(){
        return this.point_A;
    }

    public int getPoint_B(){
        return this.point_B;
    }

    public int getResult(){
        return this.result;
    }
}

class Main {
    public static void main(String[] args) {
        // 모든 함수를 완성하고 다른 함수는 필요하면 사용하되 getResult() 함수는 필수로 사용해야 함.
        // private 변수 활용 필수
        Scanner scan = new Scanner(System.in);
        Result[] s = new Result[10000001];
        int i, j, k;
        int a, b;
        int cnt;
        int min =999999999;
        //0번 방 초기화 - 1번방 부터 쓸거기에
        s[0] = new Result();

        //1번 라인 입력
        String line = scan.nextLine();
        //입력받은 라인 공백으로 분리
        String[] arr= line.split(" ");

        for(i=1;i<=arr.length;i++)
        {
            //a입력
            s[i] = new Result();
            s[i].updateIndex_A(Integer.parseInt(arr[i-1]));//arr은 0번 부터 시작
        }

        //2번 라인
        line = scan.nextLine();
        arr = line.split(" ");
        for(i=1;i<=arr.length;i++)
        {
            s[i].updateIndex_B(Integer.parseInt(arr[i-1]));
        }

        //계산 - 어쩌피 입력받은 라인 길이 이외는 필요 없음
        for(i=1;i<=arr.length;i++)
        {
            //누적합
            cnt = s[i-1].getResult(); //0번 방 부터 초기 값을 가져와 정답에 반영
            //1명이라도 이길 수 있으면
            //단 격차가 최대한 적어야 함
            //현재 a, b위치를 가져와 승리 여부 판단
            b = s[i].getPoint_B();
            k=-1;
            min =999999999;
            for(j=1;j<=arr.length;j++)
            {
                a = s[j].getPoint_A();
                if(b>a && min > b-a && s[j].getFlag())
                {
                    k=j;
                    min = b-a;
                }
            }
            if(k!=-1)
            {
                //하나 선택
                cnt++;
                s[k].setFlag(false);
            }
            s[i].updateResult(cnt); // 승리 여부 반영
        }
        //출력
        System.out.println(s[arr.length].getResult());
    }
}