/* Assignment 2 */
/** Composite Magic number is positive integer which is composite and magic
 * Composite number has more than two factors eg- 10
 * Magic number has eventual sum of the digits is equal to 1 eg 28
 * Class to display Composite Magic integers between m and n */
import java.util.*;
class CompMagic
{
    int m;  //to store lower limit
    int n;  //to store upper limit
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the positive start limit-\t");
        m=sc.nextInt();
        System.out.print("Enter the positive end limit-\t");
        n=sc.nextInt();
    }

    boolean isMagic(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        if (sum==1)
            return true;
        if (sum<10)
            return false;
        else
            return isMagic(sum);
    }

    boolean isComposite(int num)
    {
        for(int i=2; i<num; i++)

            if(num%i==0)
                return true;
        return false;
    }

    void check()
    {
        System.out.print("The Composite Magic numbers are-\t");
        for(int i=m; i<=n; i++)
            if(isMagic(i) && isComposite(i))
                System.out.print("\t"+i);
    }

    public static void main(String agrs[])
    {
        CompMagic obj=new CompMagic();
        obj.accept();
        obj.check();
    }
}