/* Assignment 1 */
/**To Check if number is Magical
 * Magical number is that whose absolute sum is 1
 * eg: 298 = 2+9+8 = 19 = 1+9 = 10 = 1+0 = 1 */
import java.util.*;
class Magical
{
    static int num;
    Magical(int n)
    {
        num=n;
    }

    int sumDigits(int x)
    {
        int sum=0;
        while(x!=0)
        {
            sum+=x%10;
            x=x/10;
        }
        if (sum<10)
            return sum;
        else
            return sumDigits(sum);
    }

    void checkMagical()
    {
        if (sumDigits(this.num)==1)
            System.out.println("It is a Magical Number.");
        else
            System.out.println("It is not a Magical Number.");
    }
    
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be checked-\t");
        int na=sc.nextInt();
        Magical obj=new Magical(na);
        obj.checkMagical();
        }
}