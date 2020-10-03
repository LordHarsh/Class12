// Project work
import java.util.*;
class Evil{
    int num;
    Evil(int n){
        num=n;
    }
    
    int decimalToBinary(){
        int temp=this.num;
        String str="";
        while (temp>0){
            str=(temp%2)+str;
            temp/=2;
        }
        System.out.printf("Binary Equivalent:\t%s\n",str);
        int count=0;
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i)=='1')
                count++;
        return count;
    }
    
    public static void main(String agrs[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int tem=sc.nextInt();
        Evil obj=new Evil(tem);
        int c=obj.decimalToBinary();
        System.out.printf("Number of 1's:\t%d\n",c);
        if(c%2==0)
            System.out.printf("%d is an Evil number", obj.num);
        else
            System.out.printf("%d is not an Evil number", obj.num);
    }
}