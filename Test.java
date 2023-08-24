import java.util.*;
class House
{
private String type;
public House(String s)
{
type=s;
}
public void printType()
{
System.out.println("The type of room "+type);
}
class Bedroom
{
private int bedroom_count;
public void printBedroom(int a)
{
bedroom_count=a;
System.out.println("Type"+type);
System.out.println("Number of rooms"+bedroom_count);
}
}
public void cooking()
{
class Kitchen
{
private int num=100;
public void display()
{
System.out.println("Number of utensils"+num);
}
}
Kitchen obj=new Kitchen();
obj.display();
}
}
class Test
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the type of room");
String t=in.nextLine();
System.out.println("Number of rooms");
int n=in.nextInt();
House ob=new House(t);
ob.printType();
House.Bedroom ob1=ob.new Bedroom();
ob1.printBedroom(n);
ob.cooking();
}
}




