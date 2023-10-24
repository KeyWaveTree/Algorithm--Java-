package com.Java.src.Iseq;

import java.io.*;

public class Iseq_1 {
    int a, b;
    int sum;
    public int iseq_1(File In, File Out) throws IOException {
        //파일 입출력 부분

        System.setIn(new FileInputStream(In));
        // 이것을 사용하면 br.readLine()을 콘솔에서 받는것이 아닌 input.txt에서 받게 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.setOut(new PrintStream(new FileOutputStream(Out)));

        // 코드 작성
        a=br.read();
        b=br.read();

        sum=a+b;

       return sum;
    }
}
