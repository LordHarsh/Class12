/* Assignment 1 */
/** Input 10 numbers in an array
* Print Biggest and smallest element
* Print array in ascending order with shifting or swapping */

import java.util.*;
class Ascending
{
    int a[];
    Ascending()
    {
        a=new int[10];
    }
    
    void input()
    {
        Scanner sam=new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter a number-");
            a[i]=sam.nextInt();
        }
    }
    
    int big()
    {
        int max=a[0];
        for(int i=0; i<10;i++)
            max=Math.max(max,a[i]);
        return max;
    }
    
    int small()
    {
        int min=a[0];
        for(int i=0; i<10;i++)
            min=Math.min(min,a[i]);
        return min;
    }
    
    void print()
    {
        int p[]=new int[10];
        for(int i=0; i<10; i++)
            p[i]=i;
        for(int i=0; i<9; i++)
        {
            int pos=i;
            for(int j=i+1; j<10; j++) 
            {
                if(a[p[j]]<a[p[pos]])
                {
                    pos=j;
                }
            }
            int temp=p[pos];
            p[pos]=p[i];
            p[i]=temp;
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(a[p[i]]);
        }
    }
    
    public static void main(String agrs[])
    {
        Ascending obj=new Ascending();
        obj.input();
        System.out.println("Smallest element is-"+obj.small());
        System.out.println("Biggest element is-"+obj.big());
        obj.print();
    }
}