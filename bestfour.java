import java.util.Arrays;
import java.io.*;
class Iscscores
{
    int number[][];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void Iscscores() throws IOException
    {
        number=new int[2][6];
        for(int i=0;i<6; i++)
        {
            System.out.println("Enter subject code and marks in seperate lines");
            number[0][i]=Integer.parseInt(br.readLine());
            number[1][i]=Integer.parseInt(br.readLine());
        }
    }

    int point(int x)
    {
        return(((int)(100-x)/10));
    }
}

public class bestfour extends Iscscores
{
    void bestfour() throws IOException
    {
        Iscscores();
        int sum=0;
        for(int i=0; i<6; i++)
            sum+=point(number[1][i]);
        System.out.println(sum);
        int pos=0;
        for(int i=0; i<4; i++)
        {
            pos=i;
            for(int j=i+1; j<6; j++)
                if((number[1][j])>(number[1][pos]))
                    pos=j;
            int tempnum=number[1][i];
            int tempsub=number[0][i];
            number[1][i]=number[1][pos];
            number[0][i]=number[0][pos];
            number[1][pos]=tempnum;
            number[0][pos]=tempsub;
            System.out.println(number[0][i]+"\t"+number[1][i]);
        }
    }
    

    public static void main(String agrs[]) throws IOException
    {
        bestfour obj=new bestfour();
        obj.bestfour();
    }
}