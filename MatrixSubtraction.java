/* Program to perform MatrixSubtraction subtraction */

import java.util.*;
class MatrixSubtraction
{
    int Arr[][];
    int m,n;
    MatrixSubtraction(int r, int c)
    {
        m=r;
        n=c;
        Arr=new int[m][n];
    }

    void fillMat()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<m; i++)
            for(int j=0; j<m; j++)
            {
                System.out.println("Enter the number");
                this.Arr[i][j]=sc.nextInt();
            }
    }

    void display()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
                System.out.print(this.Arr[i][j]+"\t");
            System.out.println();
        }
    }

    MatrixSubtraction subMat(MatrixSubtraction A)
    {
        MatrixSubtraction result=new MatrixSubtraction(m,n);
        for(int i=0; i<m; i++)
            for(int j=0; j<m; j++)
                result.Arr[i][j]=A.Arr[i][j]-this.Arr[i][j];
        return result;
    }

    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size m*n");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        MatrixSubtraction obj1=new MatrixSubtraction(s1,s2);
        System.out.println("Enter first MatrixSubtraction");
        obj1.fillMat();
        MatrixSubtraction obj2=new MatrixSubtraction(s1,s2);
        System.out.println("Enter second MatrixSubtraction");
        obj2.fillMat();
        MatrixSubtraction obj3=obj2.subMat(obj1);
        obj3.display();
    }
}
 