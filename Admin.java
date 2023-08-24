import java.util.*;
class Admin    
{String empid,name;
private String password;
int n,qu;
String b[];char k[];String o[][];
Scanner in=new Scanner(System.in);
public Admin()
{
    k=new char[qu];
    b=new String[qu];
    o=new String[qu][4];
}
public void inputdetails()
{ System.out.println("Enter the password");
    password=in.nextLine();
  System.out.println("Enter the empid");
    empid=in.next();
  System.out.println("Enter the name");
    name=in.next();
  
}
    public void input()
    {
    Scanner in=new Scanner(System.in);
    System.out.println("Number of questions");
    n=in.nextInt();
    System.out.println("Enter no.of participants"); 
    qu=in.nextInt();
}
    public void inputQuestion()
{
    
    System.out.println("Enter the options");
    for(int i=0;i<qu;i++)
    {   System.out.println("Enter the question and options for"+" "+i);
        b[i]=in.nextLine(); 
        for(int j=0;j<4;j++)
        {
        o[i][j]=in.nextLine();
        }
    }
}
public void answerkey()
  {  
  System.out.println("Enter answer key ");
   for (int i=0;i<qu;i++)
  {
  k[i]=in.next().charAt(0);
  }
}
}