import com.Java.src.Iseq.Iseq_1;
import com.Java.src.Iseq.Iseq_2;

import java.io.*;

public class Problem_Main {
    static File In= new File("D:\\WorkList\\Algorithm\\algorithm(Java)" +
                                        "\\Problem\\com\\Java\\src\\TextFile\\input.txt");
    static File Out=new File("D:\\WorkList\\Algorithm\\algorithm(Java)" +
                                        "\\Problem\\com\\Java\\src\\TextFile\\output.txt");

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
