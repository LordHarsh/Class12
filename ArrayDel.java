/* Assignment 1 */
/** To enter an 20 element array
* then delete an element from a given position
* then print remaing elements */

import java.util.*;
class ArrayDel
{
    int lim, a[];
    ArrayDel()
    {
        lim=20;
        a=new int[lim];
    }
    
    void getdata()
    {
        Scanner sec=new Scanner(System.in);
        for(int i=0; i<20; i++)
        {
            System.out.println("Enter the element");
            a[i]=sec.nextInt();
        }
    }
    
    void delelement(int pos)
    {
        for(int i=pos; i<19; i++)
            a[i]=a[i+1];
    }
    
    void printlist()
    {
        for(int i=0; i<19; i++)
            System.out.print(a[i]+"\t");
    }
    
    public static void main(String agrs[])
    {
        ArrayDel obj=new ArrayDel();
        obj.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position from 1 to 20-");
        int npos=(sc.nextInt())-1;
        obj.delelement(npos);
        obj.printlist();
    }
}