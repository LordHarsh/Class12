// Project Work
import java.io.*;
class Encryption{
    String str[];
    int CodeArray[];
    Encryption(String ss){  //Parameterized constructor
        str=ss.split(" ");
        CodeArray=new int[str.length];
    }
    
    //converting each word
    int codeWord(String ss){
        int sum=0;
        for(int i=0; i<ss.length(); i++){
            sum+=ss.charAt(i)-64;
        }
        return sum;
    }
    
    //converting the complete sentence
    void codeSentence(){
        for(int i=0; i<str.length; i++){
            CodeArray[i]=codeWord(str[i]);
        }
    }
    
    void arrange(){ //arranging the words
        for(int i=0; i<CodeArray.length-1; i++){
            int temp=i;
            for(int j=i+1; j<CodeArray.length; j++){
                if(CodeArray[j]<CodeArray[temp])
                    temp=j;
            }
            int swapint=CodeArray[i];
            CodeArray[i]=CodeArray[temp];
            CodeArray[temp]=swapint;
            String swapstr=str[i];
            str[i]=str[temp];
            str[temp]=swapstr;
        }
    }
    
    void print(){   //output
        for(String ss: str)
            System.out.print(ss+" ");
    }
    
    // main method
    public static void main(String agrs[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence-\t");
        String ss=br.readLine();
        String newss="";
        for(int i=0; i<ss.length(); i++){
            if(ss.charAt(i)=='.' || ss.charAt(i)=='!' || ss.charAt(i)=='?')
                break;
            newss+=ss.charAt(i);
        }
        Encryption obj=new Encryption(newss);
        obj.codeSentence();
        obj.arrange();
        obj.print();
    }
}