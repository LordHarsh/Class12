//Project Work
import java.util.Scanner;
class BankDenomination
{
    void solve(int num)
    {
        int t=num, sum=0;
        int arr[]=new int[]{1000,500,100,50,20,10,5,1};
        for(int i: arr)
        {
            int temp=num/i;
            sum+=temp;
            if(temp!=0)
                System.out.println(i+" * "+temp+" = "+(i*temp));
            num=num-(i*temp);

        }
        System.out.println("Total="+num);
        System.out.println("Total number of notes="+sum);
    }

    public static void main(String agrs[]) 
    {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        BankDenomination obj=new BankDenomination();
        System.out.println("Enter");
        obj.solve(num);
    }
}