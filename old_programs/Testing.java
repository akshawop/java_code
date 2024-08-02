package myjava;
import java.util.*;
class Testing
{
 public static void main(String[] args)
 {
 Scanner in=new Scanner(System.in);
 float x[]=new float[3]; 
 System.out.println("Enter 3 no.'s'"); 
 for(int i=0;i<3;i++) 
 {
 x[i] = in.nextFloat(); 
 x[i]=(float)((int)x[i]);
 if(x[i]<0)
 x[i]=x[i]-1;
 } 
 
 for(int i=0;i<3;i++)
 System.out.print(x[i]+" ");
 in.close();
 }
}