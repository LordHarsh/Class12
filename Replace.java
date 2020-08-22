// Project Work
import java.util.*;
class Replace {
    String str, substr;
    Replace() {
        str="";
        substr="";
    }

    Replace(String s) {
        str=s;
        substr="";
    }

    void display() {
        System.out.println("String is- "+str);
        System.out.println("Substring is- "+substr);
        System.out.println("Frequency is- "+find_frequency());
    }

    public void getword(String ss) {
        substr=ss;
    }

    int find_frequency() {
        int len=substr.length();
        int count=0;
        for(int i=0; i<=str.length()-len; i++)
            if(str.substring(i,i+len).compareTo(substr)==0)
                count++;
        return count;
    }
    
    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string (sentence-)");
        String s1=sc.nextLine();
        Replace obj=new Replace(s1);
        System.out.println("Enter string to be checked");
        String s2=sc.nextLine();
        obj.getword(s2);
        obj.display();
    }
}