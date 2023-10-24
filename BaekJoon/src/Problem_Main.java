import src.Iseq.Iseq_2;

import java.io.*;

public class Problem_Main {
    static File In= new File("../src/TextFile/input.txt");
    static File Out=new File("../src/TextFile/output.txt");


    //통합적으로 실행 관리하는 main 파일 - 여기에서 모든 문제를 다 실행할 계획
    public static void main(String[] args) throws IOException {
        //ISEQ 1번
        //        Iseq_1 question = new Iseq_1();
        //        int q=question.iseq_1(In, Out);
        //        System.out.println(q);
        //ISEQ 2번
        Iseq_2 question = new Iseq_2();
        question.iseq_2(In, Out);

    }
}
