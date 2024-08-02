package myjava;
import java.util.*;
public class TryCatchExeption
{
  public static void main(String[] args)
  { 
  int x[],s,i,t,j;
Scanner in=new Scanner(System.in);
System.out.println("Enter the size");
s=in.nextInt();
x=new int[s];
System.out.println("Enter the elements(numbers)");
for(i=0;i<s;i++)
{
  x[i]=in.nextInt();
}
for(i=0;i<s;i++)
{
  for(j=0;j<s-1-i;i++)
  {
  if(x[j]>x[j+1])
  {
  t=x[j];
  x[j]=x[j+1];
  x[j+1]=t;
  }
  }
  }
  System.out.println("Sorted array");
  for(i=0;i<s;i++)
  System.out.println(x[i]+" ");
  in.close();
  }
  }
  
  
  