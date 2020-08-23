// Project Work
import java.util.*;
class Numbers
{
    int N, Num, Prev, Arr[][];
    Numbers(int a, int b) {
        N=a;
        Num=b;
        Prev=Num;
        Arr=new int[N][N];
    }

    Numbers check(int n) {
        int sum=Num;
        Prev+=1;
        for(int i=Prev; ;i++){
            sum+=i;
            if(n==sum){
                Prev=n;
                break;
            }
            else if(n<sum){
                Prev=i;
                break;
            }
        }
        Num+=Prev;
        return this;
    }

    void fill(){
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
            {
                if(i==0 || i==N-1 || j==0 || j==N-1)
                    this.Arr[i][j]=check(Num).Num;
            }
    }

    void display()
    {
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
                System.out.print(this.Arr[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter starting");
        int start=sc.nextInt();
        Numbers obj=new Numbers(size, start);
        obj.fill();
        obj.display();
    }
}