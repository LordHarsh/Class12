/* Assignment 2 */
/** Goldbach number is positive even number
 * which sum of two odd primes
 * eg-6 = 3+3, 10 = 5+5 = 7+3
 * Class to display all the odd prime pairs of a positive even integer */
import java.util.*;
class Goldbach
{
    int N;
    Goldbach(int X)
    {
        N=X;
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
        for(int i=3; i<=N/2; i++)
        {
            if(isPrime(i) && isPrime(N-i) && ((N-i)!=2))
                System.out.println("= "+i+" + "+(N-i));
        }
    }

    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number between 9 an 50-\t");
        int n=sc.nextInt();
        Goldbach obj=new Goldbach(n);
        obj.print();
    }
}
 