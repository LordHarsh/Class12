import java.util.*;
class Pallin{
    int num, revnum;
    Pallin(){
        num = 0;
        revnum = 0;
    }

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number-\t");
        num=sc.nextInt();
    }

    int reverse(int y){
        if(y<10)
            return y;
        return Integer.parseInt( Integer.toString(y%10)+reverse(y/10) );
    }

    void check(){
        revnum=reverse(num);
        if(num==revnum)
            System.out.printf("%d is a pallindrome number.\n", num);
        else
            System.out.printf("%d is not a pallindrome number.\n", num);
    }
    
    public static void main(String agrs[]){
        Pallin obj=new Pallin();
        obj.accept();
        obj.check();
    }
}