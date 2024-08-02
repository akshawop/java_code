package myjava.dsa;

public class Recursion
{

  static void outer(int i, int n)
  {
    if (i > n)
      return;
      
    inner(1, i);
    System.out.println();
    outer(++i, n);
  }
  
  static void inner(int j, int i)
  {
    if (j > i)
      return;
      
    System.out.print("* ");
    inner(++j, i);
  }

  public static void main(String[] args)
  {
    outer(1, 5);
  }

}
