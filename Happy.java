import java.util.*;
class Happy
{
    int n;
    Happy(){
        n=0;
    }

    void getnum(int nn){
        n=nn;
    }

    int sum_sq_digits(int x){
        if(x==0)
            return 0;
        return ((int)Math.pow(x%10,2)+sum_sq_digits(x/10));
    }

    void isHappy(){
        int s=sum_sq_digits(n);
        while(s>10)
        {
            s=sum_sq_digits(s);
        }
        if(s==1)
            System.out.println("Is Happy");
        else
            System.out.println("Is not Happy");
    }
    
    public static void main(String agrs[]){
        Scanner sc=new Scanner (System.in);
        Happy obj=new Happy();
        System.out.println("Enter a number");
        int newno=sc.nextInt();
        obj.getnum(newno);
        obj.isHappy();
    }
}