package myjava;
import java.util.*;
class intersection
{
 public static void main(String[] args)
 {
 Scanner in = new Scanner (System.in);
 int a[],b[],c[],m,n,i,j,k=0,f,s=0;
 System.out.println("Enter the size of the first array:");
 m=in.nextInt();
 a=new int[m];
 System.out.println("Enter the element of the first array:");
 for(i=0;i<m;i++)
 a[i]=in.nextInt();
 System.out.println("Enter the size of the second array:");
 n=in.nextInt();
 b=new int[n];
 System.out.println("Enter the element of the second array:");
  for(i=0;i<n;i++)
 b[i]=in.nextInt();
// x=m+n;
 c=new int[n];
 
 for(i=0;i<m;i++)
 { f=0;
 for(j=0;j<n;j++)
 {
   if(a[i]==b[j])
   {f=1; break;}
 }
 if(f==0)
 {c[k++]=a[i]; s++;}
 }
 
 for(i=0;i<n;i++)
 { f=0;
 for(j=0;j<m;j++)
 {
   if(b[i]==a[j])
   {f=1; break;}
 }
 if(f==0)
 {c[k++]=b[i]; s++;}
 }
 
 System.out.println("Merged array:");
 for(i=0;i<s;i++)
 System.out.print(c[i]+" ");
 in.close();
 }
}