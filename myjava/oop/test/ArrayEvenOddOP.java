package myjava.oop.test;

import java.util.Scanner;
public class ArrayEvenOddOP
{
  int[] arr;
  
  ArrayEvenOddOP(int size)
  {
    arr = new int[size];
  }
  
  void input()
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the elements:");
    for(int i = 0; i < arr.length; i++)
      arr[i] = in.nextInt();
    in.close();
  }
  
  static void arrange(ArrayEvenOddOP obj)
  {
    for(int i = 0; i < obj.arr.length - 1; i++)
    {
      if(obj.arr[i] % 2 != 0)
        for(int j = i + 1; j < obj.arr.length; j++)
          if(obj.arr[j] % 2 == 0)
          {
            int temp = obj.arr[j];
            obj.arr[j] = obj.arr[i];
            obj.arr[i] = temp;
            break;
          }
    }
  }
  
  static void display(ArrayEvenOddOP obj)
  {
    for(int x : obj.arr)
      System.out.print(x + " ");
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();
    ArrayEvenOddOP ob1 = new ArrayEvenOddOP(size);
    ob1.input();
    arrange(ob1);
    System.out.println("\nArranged array:");
    display(ob1);
    in.close();
  }

}
