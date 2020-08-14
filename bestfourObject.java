import java.util.Arrays;
import java.io.*;
class Iscscores
{
    Object number[][];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void Iscscores() throws IOException
    {
        number=new Object[2][];
        number[0]=new String[6];
        number[1]=new Integer[6];
        for(int i=0;i<6; i++)
        {
            System.out.println("Enter subject name and marks in seperate lines");
            number[0][i]=br.readLine();
            number[1][i]=Integer.parseInt(br.readLine());
        }
    }

    int point(int x)
    {
        return(((int)(100-x)/10));
    }
}

public class bestfourObject extends Iscscores
{
    void bestfour() throws IOException
    {
        Iscscores();
        int sum=0;
        for(int i=0; i<6; i++)
            sum+=point((int)number[1][i]);
        System.out.println(sum);
        int pos=0;
        for(int i=0; i<4; i++)
        {
            pos=i;
            for(int j=i+1; j<6; j++)
                if(((int)number[1][j])>((int)number[1][pos]))
                    pos=j;
            int tempnum=(int)number[1][i];
            String tempsub=(String)number[0][i];
            number[1][i]=number[1][pos];
            number[0][i]=number[0][pos];
            number[1][pos]=tempnum;
            number[0][pos]=tempsub;
            System.out.println(number[0][i]+"\t"+number[1][i]);
        }
    }
    

    public static void main(String agrs[]) throws IOException
    {
        bestfourObject obj=new bestfourObject();
        obj.bestfour();
    }
}