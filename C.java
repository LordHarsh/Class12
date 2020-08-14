
// to test the use of super
class A
{
    int x;
    float y;
    A(int p, float q)
    {
        x=p;
        y=q;
    }
    void display()
    {
        System.out.println("X="+x);
        System.out.println("Y="+y);
    }
}
class B extends A
{
    double z;
    B(int p, float q, double r)
    {
        super(p,q);
        z=r;
    }
    void display()
    {
        super.display();
        System.out.println("Z="+z);
    }
}
public class C
{
    public static void main(String agrs[])
    {
        B obj=new B(20,3.4f,5.009);
        obj.display();
    }
}