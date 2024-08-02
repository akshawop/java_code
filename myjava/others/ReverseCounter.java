package myjava.others;

public class ReverseCounter
{
  public static void main(String[] args) throws Exception
  {
    for(int i = 10; i >= 1; i--)
    {
      Thread.sleep(1000);
      System.out.println(i + " ");
    }
    System.out.print("Hello World!!!");
  }

}
