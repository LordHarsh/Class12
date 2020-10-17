import java.io.*;
class StringFun{
    String str;
    int tot;
    StringFun(){
        str="";
        tot=0;
    }
    
    void accept() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string");
        str=br.readLine();
    }
    
    void frequency(){
        String str1=str.toLowerCase();
        String ss[]=str1.split(" ");
        for(int i=0; i<ss.length; i++){
            char f=ss[i].charAt(0);
            char l=ss[i].charAt(ss[i].length()-1);
            if((f=='a'||f=='e'||f=='i'||f=='o'||f=='u')&&(l=='a'||l=='e'||l=='i'||l=='o'||l=='u')){
                System.out.println(ss[i]);
                tot++;
            }
        }
    }
    void display(){
        frequency();
        System.out.printf("Total words with vowel=%d",tot);
    }
    
    public static void main(String agrs[]) throws IOException{
        StringFun obj=new StringFun();
        obj.accept();
        obj.display();
    }
}