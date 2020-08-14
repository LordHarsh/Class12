/* Assignment 1 */
/** To pring a given series */
import java.util.*;
class seriessum
{
    int n, x;
    double sum;
    
    seriessum()
    {
        n=0;
        x=0;
        sum=0.0;
    }
    
    int factorial(int x)
    {
        int res=1;
        for(int i=1; i<=x; i++)
            res*=i;
        return res;
    }
    
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x-");
        n=sc.nextInt();
        System.out.print("Enter the value of n-");
        x=sc.nextInt();
    }
    
    double term(double p, int q)
    {
        return (p/factorial(q)*1.00);
    }
    
    void displaysum()     //start from here
    {
        System.out.println("The sum of series is-\t"+calsum());
    }
    
    double calsum()
    {
        sum++;
        accept();
        for(int i=1; i<n; i++)
            sum+=term(Math.pow(x,(2*n)-1),n);
        return sum;
    }
    
    public static void main(String agrs[])
    {
        seriessum obj=new seriessum();
        obj.displaysum();
    }
}