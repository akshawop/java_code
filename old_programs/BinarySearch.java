package myjava;
import java.util.*;
class BinarySearch
{
  public static void main(String[] args)
  {
  Scanner in=new Scanner (System.in);
  int n,a[],as,i,f=0;
  System.out.println("Enter the size:");
  n=in.nextInt();
  a=new int[n];
  System.out.println("Enter the elements:");
  for(i=0;i<n;i++)
  a[i]=in.nextInt();
  System.out.println("Enter the number to be found:");
  as=in.nextInt();
  int lb=0,mid,ub=n-1;
  while(lb<=ub)
  {
    mid=(lb+ub)/2;
    if(as==a[mid])
    {
      f=1;
      break;
    }
    if(as>a[mid])
    lb=mid+1;
    if(as<a[mid])
    ub=mid-1;
  }
  if(f==1)
  System.out.print("Number Found!");
  else
  System.err.print("Number Not Found!");
  in.close();
  }
}