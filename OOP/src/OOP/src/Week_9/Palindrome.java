package OOP.src.Week_9;
import java.io.*;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        StringBuffer in = new StringBuffer();
        Scanner scan = new Scanner(System.in);

        in.append(scan.next());
        int i;
        boolean flag =true;
        for(i=0;i<in.length();i++)
        {
            if(in.charAt(i) != in.charAt(in.length()-1-i))
            {
                System.out.println(in+" 은/는 회문이 아닙니다.");
                flag =false;
            }
        }
        if(flag)
        {
            System.out.println(in + " 은/는 회문입니다.");
        }
		/*
		회문(回文) 또는 팰린드롬(palindrome)은 거꾸로 읽어도 제대로 읽는 것과 같은
		문장이나 낱말, 숫자, 문자열(sequence of characters) 등이다.

		회문인지 아닌지 판별하는 프로그램을 작성하시오.

		입력: 한 단어
		출력: (단어) 은/는 회문입니다. / (단어) 은/는 회문이 아닙니다. 중 하나로 출력

		조건: StringBuffer를 사용하여 프로그램을 작성하시오.
		*/
    }
}
