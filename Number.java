/* Assignment 1 */
/** To enter a number
 * and find and print frequency of each element */
import java.util.*;
class Number
{
    int num;
    Number()
    {
        num=0;
    }

    Number(int n)
    {
        num=n;
    }

    void digitfrequency()
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number- ");
        int N=sc.nextInt();
        Number obj=new Number(N);
        for(int i=0; i<10; i++)
        {
            a[i]=0;
            int temp=obj.num;
            while(temp!=0)
            {
                if(temp%10==i)
                    a[i]++;
                temp=temp/10;
            }
            System.out.println(i+" has is present "+a[i]+" times.");
        }
        System.out.println("The sum of digits is " + obj.sumdigits());
    }

    int sumdigits()
    {
        int temp=num;
        int sum=0;
        while (temp!=0)
        {
            sum=sum+temp%10;
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String agrs[])
    {
        Number obj1=new Number();
        obj1.digitfrequency();
    }
}