// Project Work
import java.io.*;
class Smith{
    int n;
    Smith(int num){ // Parameterized Constructor
        n=num;
    }

    int sum(int p){     //Getting the sum of digits
        if(check(p)==1)
            return p;
        return p%10 + sum(p/10);
    }
    
    int check(int n){   //check if single digit or not
        if(n<10)
            return 1;
        return 0;
    }
    
    void display(){ //output
        int count,summ=0, num=n;
        while(num!=1){
            for(int i=2; i<=n/2; i++){
                if(num%i==0){
                    count=0;
                    for(int j=1; j<=i; j++)
                        if(i%j==0)
                            count++;
                    if(count==2){
                        summ+=sum(i);
                        num=num/i;
                    }
                }
            }
        }
        if(sum(n)==summ)
            System.out.printf("%d is a SMITH number.\n",n);
        else
            System.out.printf("%d is NOT SMITH number.\n",n);
    }
    
    // main method
    public static void main(String agrs[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number-\t");
        int num=Integer.parseInt(br.readLine());
        Smith obj=new Smith(num);
        obj.display();
    }
}