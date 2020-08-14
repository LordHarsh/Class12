/* Assignment 3 */
/** Sumproduct number is one where the product of 
 * the sum of its digit and product of its digits
 * Write a program to find first 5 sumproduct number greater than ‘N’*/

import java.util.Scanner;
class Sumproduct
{
    int N;
    Sumproduct(int a)
    {
        N=a;
    }

    int digitsum(int num)
    {
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    int digitpro(int num)
    {
        int pro=1;
        while(num!=0){
            pro*=num%10;
            num/=10;
        }
        return pro;
    }

    void display()
    {
        int temp=N;
        for(int i=1;i<=5;)
        {
            temp++;
            if(temp==digitsum(temp)*digitpro(temp))
            {
                System.out.println(temp+"\t");
                i++;
            }
        }
    }

    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number-");
        int a=sc.nextInt();
        Sumproduct obj=new Sumproduct(a);
        obj.display();
    }
}