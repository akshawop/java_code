package myjava;
import java.util.*;
class testa
{
public static void main (String args[])
{
 Scanner in=new Scanner(System.in);
     String s[],s1; int i,n,p=0,q=0,mid,f=0;
     System.out.println("Enter the size:");
     n=in.nextInt();
     s=new String[n];
     System.out.println("Enter elements");
     for(i=0;i<n;i++)
     s[i]=in.next();
     System.out.println("Enter Search name");
     s1=in.next(); mid=(n-1)/2;
     
     if(s[mid].compareTo(s1)>0)
     {p=0; q=mid-1;}
     else if(s[mid].compareTo(s1)<0)
     {p=mid+1; q=n-1;}
     else
     {
     System.out.println("Index: "+mid+" Matched");
     f=1;
     }
     if(f==0)
     {
     for(i=p;i<=q;i++)
     {
     if(s[i].compareTo(s1)==0)
     {
       System.out.println("Index: "+i+" Matched!");
       break;
     }
     }
     }
     in.close();
}
}