// Project Work
// Progress
import java.io.*;
class Recursion{
    int a, b, c, limit;
    Recursion(){
        a=-1;
        b=1;
        c=limit=0;
    }
    
    void input()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Limit-\t");
        limit=Integer.parseInt(br.readLine());
    }
    
    int fib(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
    
    void generate_fibseries(){
        for(int i=1; ; i++){
            c=fib(i);
            if(c>limit)
                break;
            System.out.printf("%d\t",c);
        }
    }
    
    public static void main(String agrs[]) throws IOException{
        Recursion obj=new Recursion();
        obj.input();
        obj.generate_fibseries();
    }
}