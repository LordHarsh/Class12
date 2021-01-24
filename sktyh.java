  import java.util.*;
class sktyh
{
    Scanner sc = new Scanner(System.in);
    public void main()
    {
        int j,k=0;
        System.out.println("Input");
        int n=sc.nextInt();
        for(j=1; j<=n; j++)
            if (n%j==0)
            {
                k++;
            }
        if(k==2)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}