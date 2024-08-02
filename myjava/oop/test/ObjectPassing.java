package myjava.oop.test;

import java.util.Scanner;
public class ObjectPassing
{
  int hours;
  int minutes;
  int seconds;
  
  void input()
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the time: ");
    hours = in.nextInt();
    minutes = in.nextInt();
    seconds = in.nextInt();
    in.close();
  }
  
  static void add(ObjectPassing x, ObjectPassing y)
  {
    int second = 0;
    second += x.seconds + y.seconds;
    second += (x.minutes + y.minutes) * 60;
    second += (x.hours + y.hours) * 3600;
    
    System.out.print("Time--> " + pad(second / 3600) + " : " + pad((second % 3600) / 60) + " : " + pad((second % 3600) % 60));
  }
  
  static String pad(Integer x)
  {
    if(x > 9)
      return x.toString();
      
    return "0" + x.toString();
  }
  
  public static void main(String[] args)
  {
    ObjectPassing ob1 = new ObjectPassing();
    ObjectPassing ob2 = new ObjectPassing();
    
    ob1.input();
    ob2.input();
    
    add(ob1, ob2);
  }

}
