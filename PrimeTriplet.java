/* Assignment 2 */
/** A prime triplet is a collection of three prime numbers
 * in the form (p, p + 2, p + 6) or (p, p + 4, p + 6)
 * to display all the possible prime triplets in the given range */
import java.util.*;
class PrimeTriplet
{
    int m;  //to store lower limit
    int n;  //to store upper limit
    PrimeTriplet(int X, int Y)
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

    void print()
    {
        System.out.print("The Prime Triplets are-\t");
        for(int i=m; i<=(n-6); i++)     //taking them as inclusive
        {
            if(isPrime(i) && isPrime(i+6))
            {
                if(isPrime(i+2))
                    System.out.println(i+", "+(i+2)+", "+(i+6));
                if(isPrime(i+4))
                    System.out.println(i+", "+(i+4)+", "+(i+6));
            }
        }
    }

    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the start limit-\t");
        int a=sc.nextInt();
        System.out.print("Enter the end limit-\t");
        int b=sc.nextInt();
        PrimeTriplet obj=new PrimeTriplet(b,a);
        obj.print();
    }
}