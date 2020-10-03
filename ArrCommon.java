import java.util.*;
class ArrCommon
{
    int A[];
    int n;
    ArrCommon(int nn){
        n=nn;
        A=new int[n];
    }
    
    void readdata(){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter %d elements in ascending for array", this.n);
        for(int i=0; i<this.n; i++)
            A[i]=sc.nextInt();
    }
    
    void Common(ArrCommon B){
        int i=0, j=0;
        for( ; i<this.n; i++){
            for(; j<B.n && this.A[i]>=B.A[j]; j++){
                if(this.A[i] == B.A[j]){
                    System.out.println(B.A[j]);
                }
            }
        }
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int n1=sc.nextInt();
        ArrCommon obj1=new ArrCommon(n1);
        obj1.readdata();
        System.out.println("Enter Size");
        int n2=sc.nextInt();
        ArrCommon obj2=new ArrCommon(n2);
        obj2.readdata();
        obj1.Common(obj2);
    }
}