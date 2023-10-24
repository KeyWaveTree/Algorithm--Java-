package OOP.src.Week_7;


//주석은 지우고 제출하세요!

// 1. Person Class
// 	1) public 필드 name, protected 필드 age, private 필드 note, 디폴드 필드 job 선언
// 		-> 이때 note는 초기값 "None"으로 선언
// 	2) note의 내용을 set하고 get 하는 public void setNote(String note), public String getNote() 함수 작성

import java.util.Scanner;

class Person
{
    public String name;
    protected int age;
    private String note;
    String job;

    Person()
    {
        this.name  ="";
        this.age = 0;
        this.note = "None";
        this.job ="";
    }

    Person(String name, int age)
    {
        this.name  =name;
        this.job ="";
        this.age = age;
        this.note = "None";

    }

    public void setNote(String note)
    {
        this.note= note;
    }

    public String getNote()
    {
        return this.note;
    }
    public int getAge() {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public void setJob(String job)
    {
        this.job = job;
    }
    public String getJob()
    {
        return this.job;
    }

}

// 2. Student Class - Person 상속
// 	1) public void set(String name, int age)함수 선언 - 생성자 같은 역할을 함

class Student extends Person
{
    String note;
    Student()
    {
        super();
        super.job="Student";
    }

    public void set(String name, int age)
    {
        super.name = name;
        this.age = age;
    }
}

// 3. StudentResearcher Class - Person 상속
// 	1) public void set(String name, int age, String note)함수 선언 - 생성자 같은 역할을 함

class StudentResearcher extends Person
{
    StudentResearcher()
    {
        super();
        super.job = "Student Researcher";
    }

    public void set(String name, int age, String note)
    {
        super.name = name;
        super.age = age;
        super.setNote(note);

    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드 작성
        Scanner scan = new Scanner(System.in);
        Student student;
        StudentResearcher researcher;
        int size = scan.nextInt();//현재 people 배열의 크기를 관리하는 변수
        int cnt=0; //입력 받는 공간을 제어 확인 변수

        //입력 변수 4개
        String name, job, note;
        int age;

        while (cnt < size) {
            name = scan.next();
            job = scan.next();
            if (job.equals("Student"))
            {
                age = scan.nextInt();

                student = new Student();
                student.set(name, age);

                System.out.println("Name: "+student.getName()+" | Job: "+student.getJob()+
                        " | Age: "+ student.getAge()+" | Note: "+student.getNote());
                cnt++;
            }
            else if (job.equals("Student_Researcher"))
            {
                age = scan.nextInt();
                note = scan.next();

                researcher = new StudentResearcher();
                researcher.set(name, age, note);

                System.out.println("Name: "+researcher.getName()+" | Job: "+researcher.getJob()+
                        " | Age: "+ researcher.getAge()+" | Note: "+researcher.getNote());
                cnt++;
            }
            else
            {
                System.out.println("다시 입력해주세요.");
            }

        };

    }
}
