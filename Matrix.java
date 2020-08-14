/* Assignment 3 */
/** Replace both diagnals by highest number */

import java.util.Scanner;
class Matrix
{
    int a[][]=new int[4][4];
    void fillarray()
    {
        Scanner sc=new Scanner (System.in);
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a.length; j++)
            {
                System.out.print("Enter the element-\t");
                a[i][j]=sc.nextInt();
            }
    }

    int maxarray()
    {
        int max=a[0][0];
        for(int i[]:a)      // In every loop a returns 1d array to i
            for(int j:i)        //in every loop i return an integer to j
                if(max<j)
                    max=j;
        return max;   
    }

    void replace()
    {
        for(int i=0; i<a.length; i++)
        {
            int max=maxarray();
            a[i][i]=max;
            a[i][a.length-i-1]=max;
        }
    }

    void display()
    {
        for(int i[]:a)
        {
            for(int j:i)
                System.out.printf(j+"\t");
            System.out.println();
        }
    }
    
    public static void main(String agrs[])
    {
        Matrix obj=new Matrix();
        obj.fillarray();
        obj.display();
        obj.replace();
        obj.display();
    }
}