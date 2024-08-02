package myjava;

public class StarE
{
  public static void main(String[] args)
  {
   int i,j;
   for(i=4;i>=1;i--)
   {
      for(j=1;j<=4;j++)
      {
        if(j==1||(i==4&&j==3)||(i==3&&j==2)||(i==2&&j==2)||(i==1&&j==3))
        System.out.print("* ");
        else
        System.out.print("  ");
      }
      System.out.println();
   }
  System.out.println();
  
  
  for(i=1;i<=5;i++)
   {
  for(j=1;j<=5;j++)
  {
  if((j==1||j==5)||(i==2&&j%i==0)||(i==3&&j==3))
    System.out.print("* ");
    else
    System.out.print("  ");
  }
  System.out.println();
  }

  }}