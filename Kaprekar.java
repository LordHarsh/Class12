// Project Work
import java.io.*;
class Kaprekar{
    int p, q, count;
    Kaprekar(){ // Default Constructor
        p=q=count=0;
    }
    
    void input() throws IOException{    // Geting the input
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the start value\t");
        p=Integer.parseInt(br.readLine());
        System.out.print("Enter the end value\t");
        q=Integer.parseInt(br.readLine());
    }
    
    void swap(){    // Swapping
        if(p>q){
            int temp=p;
            q=p;
            q=temp;
        }
    }
    
    int square(int n){  // Finding the square
        return (n*n);
    }
    
    int check(int n){
        int d=Integer.toString(n).length();     //number of digit in that number
        int num=square(n);
        int digitSq=Integer.toString(num).length();     //num of digits in square 
        if(!(digitSq==(2*d) || digitSq==(2*d-1)))   //check number of digits in square
            return 0;
        if((num/(int)(Math.pow(10,d))+num%(int)(Math.pow(10,d)))==n){
            count++;
            return 1;
        }
        return 0;
    }
    
    void display(){ //output
        System.out.println("THE KAPREKAR NUMBERS ARE:");
        for(int i=p; i<=q; i++)
            if(check(i)==1)
                System.out.print(i+",");
        System.out.printf("\nFREQUENCY OF KAPREKAR NUMBERS IS :%d",count);
    }
    
    //main method
    public static void main(String agrs[]) throws IOException{
        Kaprekar obj=new Kaprekar();
        obj.input();
        obj.swap();
        obj.display();
    }
}