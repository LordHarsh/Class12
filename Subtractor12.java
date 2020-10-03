// Program to Subtract time in 12 hour format
// Not checked
import java.util.*;
class Subtractor12{
    int a[];
    Subtractor12(){
        a=new int[3];
    }

    void readtime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Time");
        String temp[]=sc.nextLine().split(" ");
        a[0]=Integer.parseInt(temp[0]);
        a[1]=Integer.parseInt(temp[2]);
        if(temp[4]=="am")
            a[2]=0;
        else
            a[2]=1;
    }

    void difftime(Subtractor12 X, Subtractor12 Y){
        if(X.a[2]==1)       //Convert input to 24 hours
            X.a[0]+=12;
        if(Y.a[2]==1)       //Convert input to 24 hours
            Y.a[0]+=12;
        this.a[1]=Y.a[1]-X.a[1];
        if(this.a[1]<0){
            this.a[1]+=60;
            this.a[0]-=1;
        }
        this.a[0]+=Y.a[0]-X.a[0];
        if(this.a[0]<0)
            this.a[0]+=24;
        if(this.a[0]>=12){      //Convert output back to 12 hour format
            this.a[0]-=12;
            this.a[2]=1;
        }
    }

    void display(){
        if(this.a[2] == 0)
            System.out.printf("%d hours %d minutes am",this.a[0], this.a[1]);
        else
            System.out.printf("%d hours %d minutes pm",this.a[0], this.a[1]);
    }

    public static void main(String agrs[]){
        Subtractor12 obj1=new Subtractor12();
        Subtractor12 obj2=new Subtractor12();
        obj1.readtime();
        obj2.readtime();
        Subtractor12 result=new Subtractor12();
        result.difftime(obj1, obj2);
        result.display();
    }
}