// Project Work
import java.io.*;
class Security{
    int len;
    String str;
    Security(int ll, String ss){
        len=ll;
        str=ss;
    }

    boolean checkLength(){
        return (str.length()==len);
    }

    boolean checkUpperCase(){
        return (str.equals(str.toUpperCase()));
    }

    boolean checkRepitition(){
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++)
                if(str.charAt(i)==str.charAt(j))
                    return false;
        }
        return true;
    }
    
    boolean checkAlternate(){
        char characters[]={'A','C','E','G','I','K'};
        for(int i=0; i<str.length()-1; i++){
            boolean check =false;
            for(char c : characters)
                if(str.charAt(i)==c)
                    check=true;
            if(!check)
                return false;
        }
        return true;
    }
    
    public static void main(String agrs[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length");
        int tlen = Integer.parseInt(br.readLine());
        if(tlen>6){
            System.out.println("Error! Length of string should not exceed 6 characters!");
            return;
        }
        System.out.println("Enter the string");
        String tstr = br.readLine();
        Security obj=new Security(tlen,tstr);
        if(!obj.checkLength()){
            System.out.println("Invalid! String length not the same as specified!");
            return;
        }
        if(!obj.checkUpperCase()){
            System.out.println("Invalid! Only upper case letters permitted!");
            return;
        }
        if(!obj.checkRepitition()){
            System.out.println("Invalid! Repetition of characters not permitted!");
            return;
        }
        if(!obj.checkAlternate()){
            System.out.println("Invalid! Only alternate letters permitted!");
            return;
        }
        System.out.println("Valid!");
    }
}