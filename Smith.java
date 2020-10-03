// Project Work
import java.io.*;
class Smith{
    int n;
    Smith(int nn){
        n=nn;
    }

    int sum(int p){
        if(p<10)
            return p;
        return p%10 + sum(p/10);
    }
    
    
}