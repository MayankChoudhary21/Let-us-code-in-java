import java.util.*;
abstract class Shape
{
abstract void RectangleArea(double x ,double y);
abstract void SquareArea(int s);
abstract void CircleArea(double r);
}
class Area extends Shape
{
public void RectangleArea(double x,double y)
{
System.out.println("Area of rectangle is "+(x*y));
}
public void SquareArea(int s)
{
System.out.println("Area of square "+(s*s));
}
public void CircleArea(double r)
{
System.out.println("Area of circle"+(3.142*r*r));
}
}
class TestArea
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter length and breadth of rectangle");
double l=in.nextDouble();
double b=in.nextDouble();
System.out.println("Enter the side of square");
int s=in.nextInt();
System.out.println("Enter the radius");
double r=in.nextDouble();
Area obj=new Area();
obj.RectangleArea(l,b);
obj.SquareArea(s);
obj.CircleArea(r);
}
}