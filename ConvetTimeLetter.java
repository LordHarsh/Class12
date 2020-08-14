import java.util.*;
class ConvetTimeLetter
{
    String  ones(int num)
    {
        switch (num)
        {
            case 1:
            case 13:
            return " one";
            case 2:
            case 14:
            return " two";
            case 3:
            case 15:
            return " three";
            case 4:
            case 16:
            return " four";
            case 5:
            case 17:
            return " five";
            case 6:
            case 18:
            return " six";
            case 7:
            case 19:
            return " seven";
            case 8:
            case 20:
            return " eight";
            case 9:
            case 21:
            return " nine";
            case 10:
            case 22:
            return " ten";
            case 11:
            case 23:
            return " eleven";
            case 12:
            return " twelve";
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
    
    String tens(int num)
    {
        if(num/10==1)
            return (elevens(num));
        if (num/10==0)
            return(ones(num));
        return(ones(num/10)+"ty"+ones(num%10));
    }
    
    String minutes(int h, int m)
    {
        if((m<60 && m>=0)&&(h<24))
        if(m==0)
            return(ones(h)+"'o clock");
        if(m<=30)
            return(tens(m)+" minutes past "+ones(h));
        if(m>30)
            return(tens(60-m)+" minutes to "+ones(h+1));
        