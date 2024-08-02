package myjava.others;

import java.util.Scanner;
public class ErrorFreeSum
{
  static int a, b, sum;
  static void sum() 
  {
    Scanner in = new Scanner(System.in);
      try
      {
        System.out.print("First number: ");
        a = in.nextInt();
      
        System.out.print("Second number: ");
        b = in.nextInt();
        
        in.close();
        sum = a + b;
      }
      catch(Exception err)
      {
        System.out.println("Wrong Input! Try Again...");
        in.close();
        sum();
      }
  }
  public static void main(String[] args)
  {
    sum();
    System.out.print("Sum: " + sum);
  }
}
