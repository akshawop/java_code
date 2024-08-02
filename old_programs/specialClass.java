package myjava;
import java.util.*;
class specialClass
{
public static void main(String[] args)
 {
 Scanner in=new Scanner(System.in);
 String s; int i,x,min=123,max=96,min1=91,max1=64;
 System.out.println("Enter the String:");
 s=in.nextLine();
 for(i=0;i<s.length();i++)
 {
   x=(int)s.charAt(i);
   if(x>=97&&x<=122&&x<min)
   min=x;
   if(x>=97&&x<=122&&x>max)
   max=x;
   if(x>=65&&x<=90&&x<min1)
   min1=x;
   if(x>=65&&x<=90&&x>max1)
   max1=x;
 }
 if(min!=123)
 System.out.println("The character with lowest ASCII code in lower case: "+(char)min);
 if(max!=96)
 System.out.println("The character with highest ASCII code in lower case: "+(char)max);
 if(min1!=91)
 System.out.println("The character with lowest ASCII code in upper case: "+(char)min1);
 if(max1!=64)
 System.out.println("The character with highest ASCII code in upper case: "+(char)max1);
 in.close();
 }
}