import java.util.*;
class paneer
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        String str=sc.nextLine();
        int i,l=str.length();
        String s="";
        for(i=l-1; i>=0; i--)
        {
            s+=str.charAt(i);
        }
        System.out.println(s);
    }
}