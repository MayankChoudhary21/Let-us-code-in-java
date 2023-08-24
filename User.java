import java.util.*;
class PallindromeException extends Exception
{
public PallindromeException(String msg)
{
System.out.println(msg);
}
}
class User
{
public void abc()throws PallindromeException
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
int n=in.nextInt();
int r=0,s=0;
int a=n;
while(a!=0)
{
r=a%10;
s=s*10+r;
a=a/10;
}
if(s==n)
throw new PallindromeException("Number is pallindrome"+ n);
else
System.out.println("Not pallindrome");
}
public static void main(String[] args)
{
try
{
User obj=new User();
obj.abc();
}
catch(PallindromeException e)
{
System.out.println(e);
}
}
}





