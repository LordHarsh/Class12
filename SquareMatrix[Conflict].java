//Project Work
import java.util.*;
class SquareMatrix {
    int size;
    int Mat[][];
    SquareMatrix(int S) {
        size=S;
        Mat=new int[size][size];
    }
    
    void createMat() {
        int num=1;
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++)
                this.Mat[i][j]=num++;
        }
    }
   
    void createMat2(int v, int arr[][]) {
        for(int i=0)
    }
    
    void display() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++)
                System.out.print(this.Mat[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix (Max=11)");
        int N=sc.nextInt();
        SquareMatrix orignalMat=new SquareMatrix(N);
        orignalMat.createMat();
        orignalMat.display();
        System.out.printf("Enter the value 'V' from where to be started");
        int V=sc.nextInt();
        System.out.printf("Enter the size of second matrix (Max=%d)", N);
        int M=sc.nextInt();
        SquareMatrix newMat=new SquareMatrix(M);
        newMat.createMat2(V, orignalMat.Mat);
        newMat.display();
    }
}