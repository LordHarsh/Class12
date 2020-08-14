import java.io.*;
class Staff
{
    float Code_num;
    String Sname;
    double Basic;
    Staff()
    {
        Code_num=0f;
        Sname="";
        Basic=0.0;
    }

    void input() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the staff's code- ");
        Code_num=Float.parseFloat(br.readLine());
        System.out.println("Enter the name of staff- ");
        Sname=br.readLine();
        System.out.println("Enter the basic salery- ");
        Basic=Double.parseDouble(br.readLine());
    }
    void printdetails()
    {
        System.out.println("Name of the staff's code-\t"+Code_num);
        System.out.println("Staff's name-\t"+Sname);
        System.out.println("Staff's basic salary-\t"+Basic);
    }
}

public class Overtime extends Staff
{
    int ndays;
    int ex_hrs;
    double rate;
    Overtime(int n, double r, int h)
    {
        super();
        ndays=n;
        ex_hrs=h;
        rate=r;
    }

    double calculate()
    {
        return ((ndays*rate*ex_hrs)+Basic);
    }
    
    void show_salary()
    {
        printdetails();
        System.out.println("No of days-\t"+ndays);
        System.out.println("No of hours-\t"+ex_hrs);
        System.out.println("Rate-\t"+rate);
        System.out.println("Total salary-\t"+calculate());
    }
    
    public static void main(String agrs[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of days worked- ");
        int d=Integer.parseInt(br.readLine());
        System.out.println("Enter the extra number of hours- ");
        int h=Integer.parseInt(br.readLine());
        System.out.println("Enter the rate- ");
        double r=Double.parseDouble(br.readLine());
        Overtime obj=new Overtime(d,r,h);
        obj.input();
        obj.show_salary();
    }
}