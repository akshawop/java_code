package myjava;
import java.util.*;
public class trending
{
  public static void main(String[] args)
  {
  Scanner in=new Scanner(System.in);
  String s; int i,x,right=65,left=90;
  System.out.println("Enter the sentence:");
  s=in.nextLine();
  s=s.toUpperCase();
  for(i=0;i<s.length();i++)
  {
    if(Character.isLetter(s.charAt(i)))
    {
     x=s.charAt(i);
     right=Math.max(right,x);
     left=Math.min(left,x);
    }
  }
  System.out.println("Left: "+ (char)left);
  System.out.println("Right: "+ (char)right);
  in.close();
  }
}
