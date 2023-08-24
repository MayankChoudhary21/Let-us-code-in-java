interface Stock_derivatives
{
double delta=0.5;
double vega=0.2;
public void find_premium();
}
class Options implements Stock_derivatives
{
int stock_price;
double option_premium;
public Options(int a)
{
stock_price=a;
}
public void find_premium()
{
option_premium=stock_price*delta*vega;
}
public static void cal_op()
{
for(int i=1;i<=10;i++)
{
int x=(int)(10*Math.random());
System.out.println(x);
Options obj=new Options(x);
obj.find_premium();
System.out.println("Updated option premium "+obj.option_premium);
}
}
}
class Stock
{
public static void main(String[]args)
{
Options.cal_op();
}
}



 

