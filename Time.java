import java.util.*;
import java.text.*;
class Time
{
    String ones(int n) {
        String a[]={""," one"," two"," three"," four"," five"
            ," six"," seven"," eight"," nine"};
        return a[n];
    }

    String elevens(int n) {
        String a[]={" ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"
            ," sixteen"," seventeen"," eighteen"," ninteen"};
        return a[n];
    }

    String tens(int n) {
        String a[]={" twenty"," thirty"," fourty"," fifty"," sixty"};
        return a[n-2];
    }

    String calc(int num)
    {

        if(num/10==1)
            return (elevens(num-10));
        if (num/10==0)
            return(ones(num));
        return(tens(num/10)+ones(num%10));
    }

    String time(int h, int m)
    {
        if((h>0 && h<13)&&(m<60 && m>=0)){
            if(h>=12)
                h-=12;
            if(m==0)
                return(calc(h)+"'O clock");
            if(m==15) 
                return("quater past"+calc(h));
            if(m<=30) 
                return(calc(m)+" minutes past"+calc(h));
            if(m==45)
                return("quater to"+calc(h+1));
            if(m>30)
                return(calc(60-m)+" minutes to"+calc(h+1));
        }
        return "invalid input";
    }

    public static void main(String agrs[]) throws ParseException{
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter hours");
        int hrs=sc.nextInt();
        System.out.println("Enter minutes");
        int min=sc.nextInt();
        Time obj=new Time();
        SimpleDateFormat printTime=new SimpleDateFormat("HH:mm");
        String str=Integer.toString(hrs)+":"+Integer.toString(min);
        System.out.print(printTime.format(printTime.parse(str))+" ");
        System.out.println((obj.time(hrs, min)).trim());
    }
} 
