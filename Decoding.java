import java.util.*;
class Decoding
{
    void print(char c, int times)
    {
        for(int i=1; i<=times; i++)
            System.out.print(c);
    }

    public static void main(String agrs[])
    {
        Decoding obj=new Decoding();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        for(int i=0; i<arr.length; i+=2)
        {
            int num=Integer.parseInt(arr[i]);
            if(num<10 && arr[i+1]!="-1")
                obj.print((char)(num+48), Integer.parseInt(arr[i+1]));
            else if(arr[i+1]!="-1")
                obj.print((char)(num), Integer.parseInt(arr[i+1]));
        }
    }
}