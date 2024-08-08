import java.util.*;
class IDBN
{
 public static void main(String[] args)
 {
    Scanner in=new Scanner(System.in);
    int n,i,x,c=0,a[],k=0; boolean isIncr=false, isDecr=false,isNot=false;
    System.out.println("Enter the Number:");
    n=in.nextInt();
    x=n;
    while(x!=0)
    {
      x=x/10;
      c++;
    }
    x=n;
    a=new int[c];
    while(x!=0)
    {
       a[k++]=x%10;
       x/=10;
    }
    for(i=0;i<c-1;i++)
    {
      if(a[i]>a[i+1])
      isIncr=true;
      else if(a[i]<a[i+1])
      isDecr=true;
      else
      {
        isNot=true;
        isIncr=false;
        isDecr=false;
        break;
      }
    }
    if(isIncr && isDecr==false && isNot==false)
    System.out.print("It is in Increasing Order.");
    else if(isDecr && isIncr==false && isNot==false)
    System.out.print("It is in Decreasing Order.");
    else if(isIncr && isDecr)
    System.out.print("It is in Bouncing Order.");
    else
    System.out.print("It is Not in any Order.");
    in.close();
  }
}