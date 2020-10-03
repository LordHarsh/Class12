// Program to Subtract time in 24 hour format
import java.util.*;
class Subtractor{
    int a[];
    Subtractor(){
        a=new int[2];
    }
    
    void readtime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Time");
        String temp[]=sc.nextLine().split(" ");
        a[0]=Integer.parseInt(temp[0]);
        a[1]=Integer.parseInt(temp[2]);
    }
    
    void difftime(Subtractor X, Subtractor Y){
        this.a[1]=Y.a[1]-X.a[1];
        if(this.a[1]<0){
            this.a[1]+=60;
            this.a[0]-=1;
        }
        this.a[0]+=Y.a[0]-X.a[0];
        if(this.a[0]<0)
            this.a[0]+=24;
    }
    
    void display(){
        System.out.printf("%d hours %d minutes",this.a[0], this.a[1]);
    }
    
    public static void main(String agrs[]){
        Subtractor obj1=new Subtractor();
        Subtractor obj2=new Subtractor();
        obj1.readtime();
        obj2.readtime();
        Subtractor result=new Subtractor();
        result.difftime(obj1, obj2);
        result.display();
    }
}