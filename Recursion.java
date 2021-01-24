// Project Work
import java.io.*;
class Recursion{
    int a, b, c, limit;
    Recursion(){    //Default Constructor
        a=-1;
        b=1;
        c=limit=0;
    }
    
    void input()throws IOException{ //Getting the input
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Limit-\t");
        limit=Integer.parseInt(br.readLine());
    }
    
    int fib(int n){ //Getting the number
        a=-1;b=1;c=0;
        for(int i=0; i<n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    
    void generate_fibseries(){  // Genertaing the series
        for(int i=1; ; i++){
            c=fib(i);
            if(c>limit)
                break;
            System.out.printf("%d\t",c);
        }
    }
    
    // main method
    public static void main(String agrs[]) throws IOException{
        Recursion obj=new Recursion();
        obj.input();
        obj.generate_fibseries();
    }
}