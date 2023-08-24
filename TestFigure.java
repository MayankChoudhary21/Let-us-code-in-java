interface GeometricFigure
{
public void area();
public void setDimensions();
}
class Ellipse implements GeometricFigure
{int a;int b;
public void setDimensions()
{
a=10;b=15;
}
public void area()
{
System.out.println("Area of ellipse"+(3.142*a*b));
}
public void display()
{
System.out.println("Dimensions"+a+" "+b);
}
}
class Rectangle implements GeometricFigure
{int a;int b;
public void setDimensions()
{
a=9;b=8;
}
public void area()
{
System.out.println("Area of rectangle"+(a*b));
}
public void display()
{
System.out.println("Dimensions"+a+" "+b);
}
}
class Square extends Rectangle
{
int s=5;
public void area()
{
System.out.println("Area of square"+(s*s));
}
public void display()
{
System.out.println("The side of square is "+s);
}
public static void drive()
{
Rectangle obj=new Rectangle();
obj.setDimensions();
obj.area();
obj.display();
Square ob=new Square();
ob.area();
ob.display();
}
}
class TestFigure
{
public static void main(String[]args)
{
Ellipse ob=new Ellipse();
ob.setDimensions();
ob.display();
Square.drive();
}
}
