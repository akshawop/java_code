package myjava.oop.sum_of_factorials;

import java.util.Scanner;
public class Series extends Number
{
  int sum;
  
  Series(int number)
  {
    super(number);
    sum = 0;
  }
  
  void calSum()
  {
    for(int i = 1; i <= n; i++)
      sum += factorial(i);
  }
  
  void display()
  {
    super.display();
    System.out.println("Sum of Factorials from 1 to " + n + "\n= " + sum);
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int input = in.nextInt();
    
    Series s = new Series(input);
    s.calSum();
    s.display();
    
    in.close();
  }
}