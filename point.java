// Project Work
import java.util.*;
class point {
    int A[][], R, C;
    point(int p, int q) {
        R=p;
        C=q;
        A=new int[R][C];
    }

    void get_array() {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<R; i++)
            for(int j=0; j<C; j++)
            {
                System.out.println("Enter the number");
                this.A[i][j]=sc.nextInt();
            }
    }

    void display_mat() {
        for(int i=0; i<R; i++)
        {
            for(int j=0; j<C; j++)
                System.out.print(this.A[i][j]+"\t");
            System.out.println();
        }
    }

    int check_pseudo(int  a[]) {
        int check=0;
        for(int i=0; i<=a.length/2; i++){
            int temp=a[i]+a[a.length-i-1];
            if(temp!=check && i!=0)
                return 0;
            check=temp;
        }
        return 1;
    }

    void result() {
        for (int i=0; i<A.length; i++){
            if(check_pseudo(A[i])==1)
                System.out.printf("Row %d is Pseudo\n",(i+1));
            else
                System.out.printf("Row %d is not Pseudo\n",(i+1));
        }
    }

    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        point obj=new point(s1,s2);
        obj.get_array();
        obj.display_mat();
        obj.result();
    }
}