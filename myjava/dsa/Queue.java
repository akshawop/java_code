package myjava.dsa;

import java.util.*;
public class Queue
{
  
  int[] queue;
  int first, last, size;
  
  Queue(int size)
  {
    queue = new int[size];
    this.size = size;
    first = 0;
    last = -1;
  }
  
  void enqueue()
  {
    if(last == size - 1)
    {
      System.err.println("\nQueue Full! No more input allowed...\n");
      System.out.println("Delete all the elements to input new values...\n");
      return;
    }
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the element: ");
    last++;
    queue[last] = in.nextInt();
    System.out.println("\n" + queue[last] + " entered the queue Successfully!\n");
    in.close();
  }
  
  void dequeue()
  {
    if(first > last)
    {
      System.err.println("\nThe Queue is already Empty!\n");
      System.out.println("You can enter new Values...\n");
      return;
    }
    
    int temp = queue[first];
    queue[first] = 0;
    first++;
    System.out.println("\n" + temp + " has been deleted from the queue!\n");
    if(first > last)
    {
      first = 0;
      last = -1;
      queue = new int[size];
      System.out.println("You can enter new Values...\n");
    }
  }
  
  void display()
  {
    if(first > last)
    {
      System.out.println("\nQueue is Empty!\n");
      return;
    }
    
    System.out.print("\n|");
    for(int i = first; i <= last; i++)
      System.out.print(queue[i] + " ");
    System.out.println("|\n");
  }
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in); 
    
    System.out.print("Define the size of the queue: ");
    int size = in.nextInt();
    
    Queue queue = new Queue(size);
    System.out.println();
    
    int choice;
    do
    {
      System.out.println("--> Enter 1 to Enqueue");
      System.out.println("--> Enter 2 to Dequeue");
      System.out.println("--> Enter 3 to Display");
      System.out.println("--> Enter 0 to Exit\n");
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
      switch(choice)
      {
        case 1:
          queue.enqueue();
          break;
        case 2:
          queue.dequeue();
          break;
        case 3:
          queue.display();
          break;
        case 0:
          break;
        default:
          System.err.println("\nWrong Input! Try Again...\n");
      }
    }while(choice != 0);
    in.close();
  }

}
