package OOP.src.Week_4_5;
import java.util.*;

public class Cat{
    String name; // 고양이 이름
    int age; // 고양이 나이
    int location; // 고양이 위치

    public Cat(){ // 고양이 생성자
        name = "cat"; age = 0; location = -1;
    }
    public Cat(String t, int n, int m){ // 고양이 생성자
        // 여기에 코드 작성
        this.name = t;
        this.age = n;
        this.location = m;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Cat[] c = new Cat[3];
        Cat temp = new Cat();
        int i;
        int j;
        int max;

        // 여기에 코드 작성
        for(i=0;i<c.length;i++)
        {

            c[i]= new Cat(scanner.next(), scanner.nextInt(), scanner.nextInt());
            //바깥쪽이라고 하는 것은 bella, luna 이다.
            //두 고양이 중  본인 말고 한마리 라는것 아무 고양이나 상관 없다.
            //하지만 모든 경우를 비교해서 최대 움직이는 횟수를 찾아야 한다.
        }

        //3좌표중 중앙 좌표에서 큰값 - 중앙 좌표 값 -1 횟수가 나옴
        //정렬
        for(i=0;i<c.length-1;i++)
        {
            for(j=1;j<c.length-1; j++)
            {
                if(c[j].location > c[j].location)
                {
                    temp = c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        //최대 길이
        if(c[2].location -c[1].location > c[1].location - c[0].location)
        {
            max=c[2].location -c[1].location;
            System.out.println(c[0].name+" " +(max-1));
        }
        else if(c[2].location -c[1].location < c[1].location - c[0].location)
        {
            max = c[1].location - c[0].location;
            System.out.println(c[2].name+" "+ (max-1));
        }
        else if(c[2].location == c[1].location || c[1].location == c[0].location)
        {
            System.out.println(c[2].name+" "+ -1);
        }
        else
        {
            max = c[1].location - c[0].location;
            System.out.println(c[2].name+" "+ (max-1));
        }
    }
}