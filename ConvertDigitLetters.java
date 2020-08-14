import java.util.*;
class ConvertDigitLetters
{
    String  ones(int num)
    {
        switch (num)
        {
            case 1:
            return " one";
            case 2:
            return " two";
            case 3:
            return " three";
            case 4:
            return " four";
            case 5:
            return " five";
            case 6:
            return " six";
            case 7:
            return " seven";
            case 8:
            return " eight";
            case 9:
            return " nine";
        }
        return "";
    }

    String  elevens(int num)
    {
        switch (num)
        {
            case 10:
            return " ten";
            case 11:
            return " eleven";
            case 12:
            return " twelve";
            case 13:
            return " thirteen";
            case 14:
            return " fourteen";
            case 15:
            return " fifteen";
            case 16:
            return " sixteen";
            case 17:
            return " seventeen";
            case 18:
            return " eighteen";
            case 19:
            return " ninteen";
        }
        return "";
    }

    String thousands(int num)
    {
        if(num==0)
            return "";
        return (ones(num)+" thousand");
    }

    String hundreds(int num)
    {
        if(num==0)
            return "";
        return (ones(num)+" hundred");
    }

    String tens(int num)
    {
        if(num/10==1)
            return (elevens(num));
        if (num/10==0)
            return(ones(num));
        return(ones(num/10)+"ty"+ones(num%10));
    }

    public static void main(String agrs[]){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        ConvertDigitLetters obj=new ConvertDigitLetters();
        System.out.println(obj.thousands(num/1000)+obj.hundreds((num%1000)/100)+obj.tens((num%100)));
    }
}