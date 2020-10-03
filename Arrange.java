// Project Work
import java.util.*;
class Arrange {
    int arr[];
    int size;
    Arrange(int n){
        size=n;
        arr=new int[size];
    }

    void input() {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<size; i++){
            System.out.print("Enter the number\t");
            this.arr[i]=sc.nextInt();
        }
    }

    void arrange() {
        int i,j;
        int pointer1=0, pointer2=0, sign1=-1,sign2=-1;
        for(i=size/2; i!=-1; pointer1++, i+=pointer1*(sign1), sign1*=-1) { 
            int pos=i;
            for(j=i, pointer2=pointer1,sign2=sign1 ; j!=-1; pointer2++, j+=pointer2*(sign2), sign2*=-1){
                if(arr[pos]>arr[j])
                    pos=j;
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
    }

    void display() {
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size (odd)");
        int s=sc.nextInt();
        if(s%2==0) {
            System.out.println("Wrong Input");
            return;
        }
        Arrange obj=new Arrange(s);
        obj.input();
        obj.arrange();
        obj.display();
    }
}