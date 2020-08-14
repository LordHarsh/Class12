/* Assignment-2 */
/** Unique number is a positive integer with no duplicate digits
 * Eg- 7, 135, 214
 * Class to Unique integers between m and n */
import java.util.*;
class UniqueNum
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

    boolean isUnique(int num)
    {
        while(num!=0)
        {
            int digit=num%10;
            num/=10;
            int temp=num;
            while(temp!=0)
            {
                if(digit==temp%10)
                    return false;
                temp/=10;
            }
        }
        return true;
    }

    void print()
    {
        System.out.println("The Unique numbers are-\t");
        for(int i=m; i<=n; i++)
            if(isUnique(i))
                System.out.print("\t"+i);
    }

    public static void main(String agrs[])
    {
        UniqueNum obj=new UniqueNum();
        obj.accept();
        obj.print();
    }
}