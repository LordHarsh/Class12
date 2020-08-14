import java.util.*;
class binary{
    int a[];
    int n, l, u;
    Scanner sc=new Scanner (System.in);
    binary(int nn){
        n=nn;
        a=new int[n];
        u=0;
        u=n-1;
    }

    void readdata(){
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the number");
            a[i]=sc.nextInt();
        }
    }

    int binary_search(int v){
        int m=(l+u)/2;
        if(a[m]<v)
            l=m+1;
        if(a[m]>v)
            u=m-1;
        if(a[m]==v)
            return m;
        if(l>u)
        return -1;
        return(binary_search(v));
    }
    
    void display(){
        System.out.println("Enter the value to be searched");
        int val=sc.nextInt();
        int fou=binary_search(val);
        if(fou==-1)
        System.out.println("Not Found");
        else
        System.out.println("Found at"+fou);
    }
    public static void main(String agrs[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of elements");
        int nn=sc.nextInt();
        binary obj=new binary(nn);
        obj.readdata();
        obj.display();
    }
}