// Project Work
// progess
import java.io.*;
class Smith{
    int n;
    Smith(int num){
        n=num;
    }

    int sum(int p){
        if(check(p)==1)
            return p;
        return p%10 + sum(p/10);
    }
    
    int check(int n){
        if(n<10)
            return 1;
        return 0;
    }
    
    void display(){
        int count,sum=0;
        for(int i=1; i<=n/2; i++){
            count=0;
            if(n%i!=0)
                break;
            for(int j=1; j<=i; j++){
                if(i%j==0)
                    count++;
            }
            if(count==2){
                
            }
        }
    }
}