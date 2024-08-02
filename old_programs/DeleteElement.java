package myjava;
import java.util.*;
class DeleteElement
{
  public static void main(String[] args)
  {
   Scanner in=new Scanner(System.in);
   int x,y,i,c=0,r=0,min,max;
   do
  {
   System.out.println("Enter the numbers(both should be posi):");
   x=in.nextInt();
   y=in.nextInt();
  }
  while(x<0 || y<0);
   max=Math.max(x,y);
   min=Math.min(x,y);
   for(i=1;i<=max;i++)
   {
     if(min*i==max)
     {
      c++;
      break;
     }
     else if(min*i<max)
     c++;
     else
     {
       r=(min*i)-max;
       break;
     }
   }
   System.out.print("Quotient: "+c+" Remainder: "+r);
   in.close();
  }
}