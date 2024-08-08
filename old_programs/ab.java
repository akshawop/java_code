import java.util.*;
class ab
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    String s; char x; int i,l=0,u=0; boolean LisPresent=false, DisPresent=false, SisPresent=false;
    System.out.println("Enter the password:");
    s=in.next();
    if(s.length()>=8)
    {
      for(i=0;i<s.length();i++)
      {
        x=s.charAt(i);
        if(Character.isLetter(x) && !LisPresent)
        {
          if(Character.isLowerCase(x))
          l=1;
          else
          u=1;
          if(l==1 && u==1)
          LisPresent=true;
        }
        
        if(Character.isDigit(x) && !DisPresent)
        DisPresent=true;
        
        if(!(Character.isLetter(x)) && !(Character.isDigit(x)) && !SisPresent)
        SisPresent=true;
      }
      if(LisPresent && DisPresent && SisPresent)
      System.out.print("Valid");
      else
      System.out.print("Invalid");
    }
    else
    System.out.print("Invalid");
    
    in.close();
  }
}