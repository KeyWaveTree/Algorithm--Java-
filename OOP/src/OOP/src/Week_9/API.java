package OOP.src.Week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class API {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<String> names  = new ArrayList<String>();
        String name;
        int n = scan.nextInt();
        for(int i=0;i<n;)
        {
            String command = scan.next();
            if(command.equals("new"))
            {
                name = scan.next();
                names.add(name);
                i++;
            }
            else if(command.equals("set")) {
                int index = scan.nextInt();
                name = scan.next();
                names.set(index, name);
            }
        }

        for(String value: names)
        {
            System.out.println(value);
        }

        // java.util.ArrayList 공식 문서:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

        // 1. ArrayList 생성: ArrayList<String> names = new ArrayList<String>();
        // 2. 1 이상의 정수 하나 입력 받기 - 입력 받은 정수 만큼 반복하여 새로운 성(Last Name) 입력받기
        // 3. 명령어 설명
        // 	(1) new (성): 새로운 성을 입력 받아 ArrayList에 저장
        // 	(2) set (인덱스) (성): 인덱스와 성을 입력 받아 해당하는 인덱스의 성을 새로운 성으로 설정
        // 4. 입력받은 정수를 n이라 하면 새로운 성을 n번 입력 받으면 자동으로 지금까지 입력받은 성을 전부 출력
        // 5. 중간에 break 없음.
        // 6. 입출력 형태는 구름을 확인할 것

    }
}
