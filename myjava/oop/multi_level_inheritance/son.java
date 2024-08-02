package myjava.oop.multi_level_inheritance;

public class son extends f
{
  int z;
  void data3()
  {
    data2();
    z=y/2;
    System.out.println("Son property="+z);
  }
  public static void main(String[] args)
  {
    son ob=new son();
    ob.data3();
  }
}