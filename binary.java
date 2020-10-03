// Project Work
//progess
import java.io.*;
class Binary{
    String n1,n2;
    Binary(){
        n1=n2="";
    }
    
    void input() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first binary number-\t");
        n1=br.readLine();
        System.out.print("Enter second binary number-\t");
        n1=br.readLine();
    }
    
    int check(String s){
        for(int i=0; i<s.length(); i++)
            if(!(s.charAt(i)=='0' || s.charAt(i)=='1'))
                return 0;
         return 1;
    }
    
    String bin_to_dec(String h){
        int decimal=h.indexOf('.');
        int len=h.length();
        double sum=0;
        for(int i=0; i<decimal ;i++){
            sum+=(h.charAt(i)-48)*Math.pow(2,decimal-i-1);
        }
        for(int i=decimal+1; i<h.length(); i++){
            sum+=(h.charAt(i)-48)*Math.pow(2,-(i-decimal));
        }
        return sum+"";
    }
    
    String dec_to_bin(String h){
        int decimal=h.indexOf('.');
        int len=h.length();
        int left=Integer.parseInt(h.substring(0,decimal));
        int rignt=Integer.parseInt(h.substring(0,decimal));
        String str="";
        while (left>0){
            str=(left%2)+str;
            left/=2;
        }
        return str;
    }
    
    void sum(){
        String sum=bin_to_dec(n1)+bin_to_dec(n2);
        System.out.println("Sum in binary number system"+sum);
        System.out.println("Sum in decimal number system"+dec_to_bin(sum));
    }
    
    public static void main(String agrs[]) throws IOException{
        Binary obj=new Binary();
        obj.input();
        if(obj.check(obj.n1)==0 || obj.check(obj.n2)==0){
            System.out.println("Invalid Input");
            return;
        }
        obj.sum();
    }
}