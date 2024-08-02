package myjava;
import java.util.*;
class Abbreviation
{
  public static void main(String[] args)
  {
  Scanner in=new Scanner(System.in);
  String s,t="",st=""; int i;
  System.out.println("Enter the sentence:");
  s=in.nextLine();
  s=s+" ";
  for(i=0;i<s.length();i++)
  {
    if(s.charAt(i)!=' ')
    t=t+s.charAt(i);
    else
    {
      st=st+t.charAt(0);
      t="";
    }
  }
  System.out.print("Abbreviation: "+st);
  in.close();
  }
}