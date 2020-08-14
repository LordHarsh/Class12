/* Question 8 of first comparative 2020 */
import java.util.*;
class Composite 
{
    int m;
    int n;
    int arr[][];
    Composite (int mm, int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    int isComposite(int p)
    {
        int count =0;
        for(int i=1; i<=p; i++)
            if(p%i==0)
                count++;
        if(count==2)
            return 1;
        return 0;
    }

    void fill()
    {
        int num=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                while(true)
                {
                    num++;
                    if(isComposite(num)==0)
                        break;
                }
                arr[j][i]=num;
            }
        }
    }

    void display()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Composite obj=new Composite(a,b);
        obj.fill();
        obj.display();
    }
}