package myjava.dsa;

import java.util.Scanner;
public class LuckyPerson
{
  
  static String[] people;
  static int size;
  
  static void delete(int index)
  {
    System.out.println(people[index] + " at position [" + (index + 1) + "]" + " is fired!\n");
    
    for(int i = index; i < size - 1; i++)
      people[i] = people[i + 1];
      
    people[size - 1] = "";
    size--;
  }
  
  static void display()
  {
    System.out.println("Remaining Contestants:");
    
    for(int i = 0; i < size - 1; i++)
      System.out.print(people[i] + ", ");
    System.out.print(people[size - 1]);
    System.out.println("\n");
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("[Welcome to the game of LUCK!]\n");
    
    System.out.print("Enter the size: ");
    size = in.nextInt();
    
    people = new String[size];
    
    System.out.println("\nEnter the names:");
    for(int i = 0; i < size; i++)
    {
      System.out.print((i + 1) + " --> ");
      people[i] = in.next();
    }
    
    long startTime = System.nanoTime();
    
    System.out.println();
    while(size != 1)
    {
      
      try
      {
        Thread.sleep(1500);
      }
      catch(Exception err)
      {
        System.err.println("Something went wrong...");
        in.close();
        return;
      }
      
      int random = (int) (Math.random() * size);
      delete(random);
      
      try
      {
        Thread.sleep(500);
      }
      catch(Exception err)
      {
        System.err.println("Something went wrong...");
        in.close();
        return;
      }
      
      if(size != 1)
        display();
    }
    
    System.out.println("The Lucky Person is " + people[0] + "!!! 🎉🎉🥳");
    
    in.close();
    
    long endTime = System.nanoTime();
    
    System.err.println("\nTime taken: " + ((endTime - startTime) / Math.pow(10, 9)) + " seconds");
  }

}
