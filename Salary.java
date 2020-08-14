import java.io.*;
import java.util.*;
class Employee
{
    String empNo;
    String empName, empDesig;
    Employee(String no, String nn, String dd)
    {
        empNo=no;
        empName=nn;
        empDesig=dd;
    }

    Employee()
    {
        empNo="";
        empName="";
        empDesig="";
    }

    void display()
    {
        System.out.format("Name of the Employee- %s\n",empName);
        System.out.format("Employee's Designation- %s\n",empDesig);
        System.out.format("Employee's Number-%s\n",empNo);
    }
}
public class Salary extends Employee
{
    double Basic;
    double net;
    Salary(double bb, String no, String nn, String dd)
    {
        super(no,nn,dd);
        Basic=bb;
    }
    
    void calculate()
    {
        double sal=Basic+(0.1*Basic)+(0.15*Basic);
        net=sal-(0.08*sal);
    }
    
    void display()
    {
        super.display();
        calculate();
        System.out.format(Locale.US,"Employee's Net salary- %,.2f\n",net);
    }

    public static void main(String agrs[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of Employee- ");
        String nn=br.readLine();
        System.out.println("Enter the Employee's Designation- ");
        String dd=br.readLine();
        System.out.println("Enter the number of Employee- ");
        String no=(br.readLine());
        System.out.println("Enter the basic pay of employee- ");
        double bb=Double.parseDouble(br.readLine());
        Salary obj=new Salary(bb,no,nn,dd);
        obj.display();
    }
}