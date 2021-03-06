import java.util.Scanner;
class BankDenomination
{
    void solve(int num)	// Calculating the denominations
    {
        int t=num, sum=0;
        int arr[]=new int[]{1000,500,100,50,20,10,5,1};
        for(int i: arr)
        {
            int temp=num/i;
            sum+=temp;
            if(temp!=0)
                System.out.println(i+" X "+temp+" = "+(i*temp));
            num=num-(i*temp);
        }
        System.out.println("TOTAL="+t);
        System.out.println("TOTAL NUMBER OF NOTES="+sum);
    }

    String ones(int n) {	// Storing the possible words
        String a[]={" ZERO"," ONE"," TWO"," THREE"," FOUR"," FIVE"
            ," SIX"," SEVEN"," EIGHT"," NINE"};
        return a[n];
    }
    
    String calcLetters(int num) {	// Getting the letters
        String str="";
        while(num>=10) {
            str=ones(num%10)+str;
            num/=10;
        }
        return ones(num)+str;
    }

    public static void main(String agrs[]) // Main
    {
        Scanner sc=new Scanner (System.in);
        BankDenomination obj=new BankDenomination();
        System.out.println("Enter");
        int num=sc.nextInt();
        if(num>99999) {
            System.out.println("INVALID AMOUNT");
            return;
        }
        System.out.println(obj.calcLetters(num).trim()
                +"\nDENOMINATION: ");
        obj.solve(num);
    }
}
