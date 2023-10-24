package com.Java.src.IO;

import java.io.*;

public class InOut {
    public BufferedReader br;

    public InOut(File In, File Out) throws FileNotFoundException {
        System.setIn(new FileInputStream(In));
        // 이것을 사용하면 br.readLine()을 콘솔에서 받는것이 아닌 input.txt에서 받게 된다.
        br = new BufferedReader(new InputStreamReader(System.in));
        System.setOut(new PrintStream(new FileOutputStream(Out)));
    }
}
