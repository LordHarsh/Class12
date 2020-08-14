import java.io.*;
class Library
{
    String name,author;
    double P;
    Library(String nn, String aa, double pp)
    {
        name=nn;
        author=aa;
        P=pp;
    }

    void show() 
    {
        System.out.println("Name of the book-"+name);
        System.out.println("Author of the book-"+author);
        System.out.println("Price of the book-"+P);
    }
    
}
public class ComputeLibFine extends Library
{
    int d;  
    double fine;
    ComputeLibFine(int dd, String nn, String aa, double pp)
    {
        super(nn,aa,pp);
        d=dd;
    }
    void fine()
    {
        if(d>7)
            fine=(d-7)*2;
        if(d>12)
            fine=10+(d-7)*3;
        if(d>17)
            fine=10+15+(d-12)*5;
    }
    
    void display()
    {
        show();
        System.out.println("No of day the book is kept-"+d);
        System.out.println("Fine to be paid-"+fine);
        System.out.println("Total amount to be paid-"+((0.02*P*d)+fine));
    }
    public static void main(String agrs[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of book- ");
        String nn=br.readLine();
        System.out.println("Enter the name of author- ");
        String aa=br.readLine();
        System.out.println("Enter the number of days- ");
        int dd=Integer.parseInt(br.readLine());
        System.out.println("Enter the price of book- ");
        int pp=Integer.parseInt(br.readLine());
        ComputeLibFine obj=new ComputeLibFine(dd,nn,aa,pp);
        obj.display();
    }
}