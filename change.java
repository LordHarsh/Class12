import java.util.*;
class change
{
    int n;
    int a[];
    Scanner sc=new Scanner(System.in);
    change(){
        a=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        n=0;
    }

    void input(){
        System.out.println("Enter the number");
        n=sc.nextInt();
    }

    void hexadecimal(int num){
        int count=0;
        while(num>16){
            a[count++]=num%16;
            num=num/16;
        }
        a[count]=num;
        for(int i=count; i >= 0; i--){
            if(a[i]==10)
                System.out.print('A');
            else if(a[i]==11)
                System.out.print('B');
            else if(a[i]==12)
                System.out.print('C');
            else if(a[i]==13)
                System.out.print('D');
            else if(a[i]==14)
                System.out.print('E');
            else if(a[i]==15)
                System.out.print('F');
            else
                System.out.print(a[i]);
        }
        System.out.println();
    }

    void decihexa(){
        
    }
}