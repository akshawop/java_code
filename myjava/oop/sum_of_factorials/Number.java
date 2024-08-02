package myjava.oop.sum_of_factorials;

public class Number
{
  int n;
  
  Number(int number)
  {
    n = number;
  }
  
  int factorial(int a)
  {
    int result = 1;
    for(int i = 1; i <= a; i++)
      result *= i;
      
    return result;
  }
  
  void display()
  {
    System.out.println("Entered Number: " + n);
  }
}