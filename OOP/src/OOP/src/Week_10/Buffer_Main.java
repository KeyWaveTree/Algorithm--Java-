package OOP.src.Week_10;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Buffer_Main {
    public static void main(String[] args) throws IOException {
        File scr = new File("D:\\WorkList\\Algorithm\\algorithm(Java)\\OOP\\src\\OOP\\src\\Week_10\\lab10.txt");
        FileInputStream fin = new FileInputStream(scr);
        BufferedReader br = new BufferedReader(new InputStreamReader(fin, StandardCharsets.UTF_8));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word1 = br.readLine();
        String word2 = br.readLine();
        String word3 = br.readLine();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);




//		- 텍스트(txt)파일 안에 있는 내용을 읽어 들인 후, 각 줄의 내용을 대문자로 변환한다.
//		- 변환된 내용을 콘솔에 출력한다.
//		- lab10.txt 파일 경로: "data/lab10.txt" 사용
//
//		입력: 없음(lab10.txt 내용을 읽어오기)
//		출력:
//			HELLO. THIS IS OBJECT-ORIENTED PROGRAMMING.
//			YOU'RE WORKING ON THE WEEK 10 LAB.
//			THIS PROBLEM IS ABOUT BUFFERED INPUT AND OUTPUT STREAMS.
//		조건: 버퍼 입출력 스트림을 사용하여 프로그램을 작성하시오.
    }
}

