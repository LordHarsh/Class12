/* Assignment 1 */
/** To input 100 employ code
 * Then sort using selction sort
 * Then search an employ code using selection sort*/
import java.util.*;
class indexarray
{
    int Arr[];
    indexarray()
    {
        Arr=new int[100];
    }

    void fillarray()
    {
        for(int i=0; i<100; i++)
        {
            Scanner sec=new Scanner(System.in);
            System.out.println("Enter the elements");
            Arr[i]=sec.nextInt();
        }
    }

    void sortarr()
    {
        for(int i=0; i<99; i++)
        {
            int pos=i;
            for(int j=i+1; j<100; j++)
                if(Arr[j]<Arr[pos])
                    pos=j;
            int temp=Arr[i];
            Arr[i]=Arr[pos];
            Arr[pos]=temp;
        }
    }
    
    void binarysearch(int s)
    {
        int l=0, u=99, m=0, flag=0;
        while(l<=u)
        {
            m=(l+u)/2;
            if (Arr[m]>s)
                u=m-11;
            else if (Arr[m]<s)
                l=m+1;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
    
    public static void main(String agrs[])
    {
        indexarray obj=new indexarray();
        obj.fillarray();
        obj.sortarr();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched-");
        int search=sc.nextInt();
        obj.binarysearch(search);
    }
}