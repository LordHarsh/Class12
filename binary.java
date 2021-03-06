// Project Work
import java.io.*;
class Binary{
    String n1,n2;
    Binary(){
        n1=n2="";
    }

    void input() throws IOException{ // Getting the input from the user
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first binary number-\t");
        n1=br.readLine();
        System.out.print("Enter second binary number-\t");
        n2=br.readLine();
    }

    int check(String s){    //Checking if it's binary
        for(int i=0; i<s.length(); i++)
            if(!(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='.'))
                return 0;
        return 1;
    }

    String bin_to_dec(String h){        //converting binary
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

    String dec_to_bin(String h){    //converting decimal
        int decimal=h.indexOf('.');
        int len=h.length();
        int left=Integer.parseInt(h.substring(0,decimal));
        double right=Integer.parseInt(h.substring(decimal+1,len))/Math.pow(10, len-decimal-1);
        String str="";
        while (left>0){
            str=(left%2)+str;
            left/=2;
        }
        str+=".";
        for(int i=1; i<=5; i++){
            right*=2;
            str+=(int)(right/1);
            right=right%1;
        }
        return str;
    }

    void sum(){ // adding
        Float sum=Float.parseFloat(bin_to_dec(n1))+Float.parseFloat(bin_to_dec(n2));
        System.out.println("Sum in binary number system is "+dec_to_bin(sum+""));
        System.out.println("Sum in decimal number system is "+sum);
    }
    
    // main method
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