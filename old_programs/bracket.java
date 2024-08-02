package myjava;
import java.util.*;
public class bracket 
{
  public static void main(String[] args)
  {
   Scanner in=new Scanner(System.in);
   String s,x=""; int i,j;
   System.out.println("Enter the sentence:");
   s=in.nextLine();
   for(i=0;i<s.length();i++)
   {
     if(s.charAt(i)!='(')
     x=x+s.charAt(i);
     else
     {
       for(j=i;j<s.length();j++)
       {
         if(s.charAt(j)==')')
         {
          i=j+1;
          break;
         }          
       }
     }
   }
   System.out.print(x);
   in.close();
  }
}
