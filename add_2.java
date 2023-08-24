import java.util.*;
class add_2
{
    int a,b,c;
    public void getdata(int a,int b)
    {
        this.a=a;
        this.b=b;
        c=a+b;
    }
    public void  putdata()
    {
        System.out.println("a "+a);
        System.out.println("b " +b);
        System.out.println("Sum is "+c);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int k=in.nextInt();
        int y=in.nextInt();
        add_2 ob=new  add_2();
        ob.getdata(k,y);
        ob.putdata();
    }
}

