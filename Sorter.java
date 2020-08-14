/* Assignment 3 */
/** Ascending Sorting */

import java.util.Scanner;
class Sorter
{
    int A[];
    Sorter()
    {
        A=new int[20];
    }
    
    void readlist()
    {
        Scanner sc=new Scanner (System.in);
        for(int i=0; i<A.length; i++)
        {
            System.out.println("Enter the Element-");
            A[i]=sc.nextInt();
        }
    }
    
    void displaylist()
    {
        for(int i:A)
        {
            System.out.print(i+"\t");
        }
    }
    
    int indexofmin(int startindex)
    {
        int temp=startindex+1;
        for(int i=startindex+1; i<A.length; i++)
        {
            if(A[temp]>A[i])
            temp=i;
        }
        return temp;
    }
    
    void selectionsort()
    {
        for(int i=0; i<A.length-1; i++)
        {
            int m=indexofmin(i);
            int temp=A[i];
            A[i]=A[m];
            A[m]=temp;
        }
    }
    
    public static void main(String agrs[])
    {
        Sorter obj=new Sorter();
        obj.readlist();
        obj.selectionsort();
        obj.displaylist();
    }
}