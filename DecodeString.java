// Project Work
import java.io.*;
class DecodeString{
    String str;
    DecodeString(String ss){
        str=ss;
    }
    
    int decode(){
        int sum=0;
        for(int i=0; i<str.length(); i++){
            int temp=str.charAt(i)-64;
            if(temp>18)
            sum+=temp-18;
            else if(temp>9)
            sum+=temp-9;
            else
            sum+=temp;
        }
        return sum;
    }
    
    public static  void main(String agrs[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string-\t");
        String tem=br.readLine();
        DecodeString obj=new DecodeString(tem);
        System.out.printf("Decoded-\t%d\n",obj.decode());
    }
}