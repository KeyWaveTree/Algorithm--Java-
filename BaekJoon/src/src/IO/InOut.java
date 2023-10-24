package src.IO;

import java.io.*;

public class InOut {
    //입력된 버퍼가 사라지면 안되므로 변수로 저장
    public BufferedReader br;

    //file -in: input.txt
    //file -out: output.txt
    public InOut(File In, File Out) throws FileNotFoundException {

        //InOut 이라는 클래스는 파일에서 input을 buffer로 받아 output 파일에서 결과를 보여준다.
        //파일 입출력 부분
        //각 java 폴더 마다 입출력 할때 아래있는 형식을 매번 써야 해서 귀찮음
        //해결 - 따로 java 파일을 만들어서 업로드 해주는 형식으로 변화 - 파일 입출력을 클래스를 불러오는 형식으로 변화
        System.setIn(new FileInputStream(In));//경로에서 입력을 받은 변수를 전달
        // 이것을 사용하면 br.readLine()을 콘솔에서 받는것이 아닌 input.txt에서 받게 된다.
        br = new BufferedReader(new InputStreamReader(System.in)); //입력한 값을 전달 해주는 스트림
        System.setOut(new PrintStream(new FileOutputStream(Out)));//출력을 하기 위해 스트림으로 결과를 저장
    }
}
