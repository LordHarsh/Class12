/* Assignment 2 */
/** Circular Prime is prime that remains prime under cyclic shifts of digits
 * Eg- 131, where 131, 311, 113 all are prime
 * Class to display circular prime integers between m and n */
import java.util.*;
class CircularPrime
{
    int m;  //to store lower limit
    int n;  //to store upper limit
    CircularPrime(int X, int Y)
    {
        n=X;
        m=Y;
    }

    boolean isPrime(int num)
    {
        int count=0;
        for(int i=1; i<=num; i++)
            if(num%i==0)
                count++;
        if(count==2)
            return true;
        else
            return false;
    }

    int rotate(int n)
    {
        int temp=n;
        int count=0;
        while (temp!=0)
        {
            count++;
            temp/=10;
        }
        int f=n%(int)Math.pow(10,count-1);
        int l=n/(int)Math.pow(10,count-1);
        return (f*10 + l);
    }

    void printall()
    {
        System.out.print("The Circular Prime numbers are-\t");
        for(int i=m; i<=n; i++)
        {
            int temp=i;
            int count=0;
            while (temp!=0)
            {
                count++;
                temp/=10;
            }
            int flag=0;     //flag 0 means all prime
            for(int j=1; j<=count; j++)
            {
                rotate(i);
                if(!isPrime(i))
                    flag=1;
            }
            if(flag==0)
                System.out.print("\t"+i);
        }
    }

    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the start limit-\t");
        int a=sc.nextInt();
        System.out.print("Enter the end limit-\t");
        int b=sc.nextInt();
        CircularPrime obj=new CircularPrime(b,a);
        obj.printall();
    }
}