/* Assignment 1 */
/** Input 10 numbers in an array
 * Print Biggest and smallest element
 * Print array in ascending order with shifting or swapping */

import java.util.*;
class Ascending_retry
{
    int a[];
    Ascending_retry()
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
        int check[]=new int[10];           //to store positions already printed
        int set=0;
        int pos=-1;
        for(int i=0; i<10; i++)
        {
            int smallest=this.big();    //becoz every element is either smaller or equal to this
            outer_loop:
            for(int j=0; j<10; j++)
            {
                int flag=0;
                if(a[j]<=smallest)
                {
                    for(int k=0; k<set; k++)    //check if position is already printed
                        if(j==check[k])
                            flag=1;
                    if(flag==1)
                        continue;   //to ignore update of smallest if position is already printed
                    smallest=a[j];
                    pos=j;
                }
            }
            System.out.println(a[pos]);
            check[i]=pos;
            set++;
        }
    }
    
    public static void main(String agrs[])
    {
        Ascending_retry obj=new Ascending_retry();
        obj.input();
        System.out.println("Smallest element is-"+obj.small());
        System.out.println("Biggest element is-"+obj.big());
        obj.print();
    }
}