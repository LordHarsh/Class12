// Project Work
import java.util.*;
class SaddlePoint {
    int arr[][], rowSize, colSize, rowIndex, colIndex;
    void get_array()
    {
        arr=new int[rowSize][colSize];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<rowSize; i++)
            for(int j=0; j<colSize; j++)
            {
                System.out.println("Enter the number");
                this.arr[i][j]=sc.nextInt();
            }
    }

    void display_mat()
    {
        for(int i=0; i<rowSize; i++)
        {
            for(int j=0; j<colSize; j++)
                System.out.print(this.arr[i][j]+"\t");
            System.out.println();
        }
    }

    void check_saddle() {
        int count=0;
        for(int i=0; i<arr.length; i++) {
            rowIndex=i;
            colIndex=0;
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j]<arr[i][colIndex])
                    colIndex=j;
            }
            boolean flag=true;
            for(int k=0; k<arr.length; k++) {
                if(arr[rowIndex][colIndex]<arr[k][colIndex])
                    flag=false;
            }
            
            if(flag) {
                System.out.printf("Saddle point is %d (row=%d and column=%d)"
                ,arr[rowIndex][colIndex], rowIndex, colIndex);
                count++;
            }
        }
        if(count==0)
            System.out.println("No Saddle Point");
    }

    public static void main(String agrs[])
    {
        SaddlePoint obj=new SaddlePoint();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows- ");
        obj.rowSize=sc.nextInt();
        System.out.print("Enter the number of columns- ");
        obj.colSize=sc.nextInt();
        obj.get_array();
        System.out.println("Matrix entered is-");
        obj.display_mat();
        obj.check_saddle();
    }
}