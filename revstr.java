import java.io.*;
class revstr
{
    String str;
    String str2;
    /**
     * Constructor for objects of class jask
     */
    revstr()
    {
        // initialise instance variables
        str = "";
        str2="";
    }

    void getstr() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
    }

    void  rec(int i)
    {
        if(i!=0){
            str2+=str.charAt(i-1);
            rec(i-1);
        }
    }

    void check(){
        rec(str.length());
        if(str.compareTo(str2)==0)
            System.out.println("Pallendrome");
        else
            System.out.println("Not Pallendrome");
    }
    
    public static void main(String agrs[]) throws IOException{
        revstr obj=new revstr();
        obj.getstr();
        obj.check();
    }
}

