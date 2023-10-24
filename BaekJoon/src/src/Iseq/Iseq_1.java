package src.Iseq;

import java.io.*;

public class Iseq_1 {
    int a, b;
    int sum;

    //in - input.txt 파일
    //out - output.txt 파일
    public int iseq_1(File In, File Out) throws IOException {
        //파일 입출력 부분

        System.setIn(new FileInputStream(In)); //경로에서 입력을 받은 변수를 전달
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력한 값을 전달 해주는 스트림
        System.setOut(new PrintStream(new FileOutputStream(Out))); //출력을 하기 위해 스트림으로 결과를 저장

        // 코드 작성
        a=br.read();
        b=br.read();

        sum=a+b;

       return sum;
    }
}
