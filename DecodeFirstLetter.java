// Project work
import java.io.*;
class DecodeFirstLetter{        //constructors
    String str[];
    DecodeFirstLetter(String ss){
        str=ss.split(" ");
    }
    
    void edit(){    //editting the string
        for(int i=0; i<str.length; i++){
            str[i]=str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase();
        }
    }
    
    void print(){
        boolean checkSomethingPrinted;
        for(int i=1;;i++){      //controling letter to be printed
            checkSomethingPrinted= false;
            for(int j=str.length-1; j>=0; j--){    //controling word to be printed
                if(str[j].length()>=i){
                    System.out.print(str[j].charAt(str[j].length()-i)+"\t");
                    checkSomethingPrinted=true;
                }
                else        //if anything is not printed then leave space
                    System.out.print(" \t");
            }
            if(checkSomethingPrinted==false)
                break;
            System.out.println();
        }
    }
    
    public static void main(String agrs[]) throws IOException{  // main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence-\t");
        String ss=br.readLine();
        DecodeFirstLetter obj=new DecodeFirstLetter(ss);
        obj.edit();
        obj.print();
    }
}