import java.util.*;
class MatrixRowColumn
{
    int A[][];
    int m,n;
    MatrixRowColumn(int mm, int nn)
    {
        m=mm;
        n=nn;
        A=new int[m][n];
    }

    void fillMat()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
            {
                System.out.print("Enter the number\t");
                this.A[i][j]=sc.nextInt();
            }
    }

    void display() {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(this.A[i][j]+"\t");
            System.out.println();
        }
    }

    void max() {
        int maxrow=0;
        int maxcol=0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(A[i][j]>A[maxrow][maxcol])
                {
                    maxrow=i;
                    maxcol=j;
                }
            }
        }
        System.out.printf("Largest Number: %d\nRow: %d\nColumn: %d\n"
        ,A[maxrow][maxcol],maxrow,maxcol);
    }

    void min() {
        int minrow=0;
        int mincol=0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(A[i][j]<A[minrow][mincol]) {
                    minrow=i;
                    mincol=j;
                }
            }
        }
        System.out.printf("Smallest Number: %d\nRow: %d\nColumn: %d\n"
        ,A[minrow][mincol],minrow,mincol);
    }

    void sort() {
        for(int i=0;i<m;i++) {
            for(int j=0; j<n; j++) {
                int rowpos=i;
                int colpos=j;
                for(int k=i;k<m; k++) {
                    for(int l=0; l<n; l++) {
                        if(i==k && l==0)
                            l=j;
                        if(A[rowpos][colpos]>A[k][l]) {
                            rowpos=k;
                            colpos=l;
                        }
                    }
                }
                int temp=A[i][j];
                A[i][j]=A[rowpos][colpos];
                A[rowpos][colpos]=temp;
            }
        }
    }

    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows- ");
        int row=sc.nextInt();
        System.out.print("Enter the number of columns- ");
        int col=sc.nextInt();
        MatrixRowColumn obj=new MatrixRowColumn(row, col);
        obj.fillMat();
        System.out.println("\nOrignal Matrix-");
        obj.display();
        obj.max();
        obj.min();
        obj.sort();
        System.out.println("Rearranged Matrix-");
        obj.display();
    }
}