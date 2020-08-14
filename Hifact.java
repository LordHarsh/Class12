import java.util.*;
class Hifact
{
    int a,b, hcf,lcm;
    Hifact(){
        a=0;
        b=0;
    }
    
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    
    int rechcf(int x, int y){
        if(y>(b/2))
            return x;
        if((a%y==0)&&(b%y==0))
            x=y;
        return (rechcf(x,y+1));
    }
    
    int fn_lcm(int a, int b, int hcf){
        return((a*b)/hcf);
    }
    
    void result(){
        hcf=rechcf(1,1);
        lcm=fn_lcm(a,b,hcf);
        System.out.println("HCF="+hcf+"\nLCM="+lcm);
    }
    
    public static void main(String agrs[]){
        Hifact obj=new Hifact();
        obj.getdata();
        obj.result();
    }
}