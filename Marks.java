import java.io.*;
class Student
{
    int Age;
    String Name, Gender;

    void inputdetails1() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of Student- ");
        Name=br.readLine();
        System.out.println("Enter the student's gender- ");
        Gender=br.readLine();
        System.out.println("Enter the student's age- ");
        Age=Integer.parseInt(br.readLine());
    }

    void show1()
    {
        System.out.println("Name of the name of Student-\t"+Name);
        System.out.println("Student's gender-\t"+Gender);
        System.out.println("Student's age-\t"+Age);
    }
}

public class Marks extends Student
{
    int Regnum, m;
    String Subject;

    void inputdetails2() throws IOException
    {
        inputdetails1();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the register number- ");
        Regnum=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of subject- ");
        Subject=br.readLine();
        System.out.println("Enter the marks obtained- ");
        m=Integer.parseInt(br.readLine());
    }

    void show2()
    {
        show1();
        System.out.println("Register number-\t"+Regnum);
        System.out.println("Name of subject-\t"+Subject);
        System.out.println("Marks obtained-\t"+m);
    }

    public static void main(String agrs[]) throws IOException
    {
        Marks obj=new Marks();
        obj.inputdetails2();
        obj.show2();
    }
}
