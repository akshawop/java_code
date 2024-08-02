package myjava;
import java.util.*;
class FirstLetterUpperCase
{
  public static void main(String[] args)
  {
  Scanner in=new Scanner(System.in); 
  String s; int i; char ch;
  System.out.println("Enter the String: ");
  s=in.nextLine();
  s=s.toUpperCase();
  for(i=0;i<s.length();i++)
  {
   ch=s.charAt(i);
   if(i==0 || s.charAt(i-1)==' ')
   System.out.print(ch);
   else
   {
   ch=Character.toLowerCase(ch);
   System.out.print(ch);
   }
  }
  in.close();
  }
}