package src.Iseq;

import java.io.*;
import src.IO.*;
public class Iseq_2 {
    public void iseq_2(File In , File Out) throws IOException
    {
        InOut io = new InOut(In, Out);
        int a = io.br.read();
        int b = io.br.read();

        System.out.printf("%d %d %d %d",a+b, a-b, a*b, a/b);
    }
}
