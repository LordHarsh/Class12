import java.io.*;
class ISBN
{
    String num;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the ISBN code- ");
        num=br.readLine();
    }

    boolean calculate()
    {
        int arr[]=new int[10];
        int i=0;
        for(String ch:num.split(""))
        {
            if(ch.equalsIgnoreCase("X"))
            {
                arr[i]=10;
                break;
            }
            arr[i]=Integer.parseInt(ch);
            i++;
        }
        int output=0;
        for(i=0; i<10; i++)
        {
            output+=(10-i)*arr[i];
        }
        System.out.println(output);
        if(output%11==0)
        return true;
        else 
        return false;
    }
    public static void main(String agrs[]) throws IOException
    {
        ISBN obj=new ISBN();
        obj.input();
        System.out.println(obj.calculate()+" that it's a valid ISBN code");
    }
}