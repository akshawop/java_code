package myjava.dsa;

import java.util.*;
public class Stack
{
  int[] stack;
  int top, size; 
  
  Stack(int size)
  {
    stack = new int[size];
    this.size = size;
    top = -1;
  }
  
  void push()
  {
    Scanner in = new Scanner(System.in);
    if(top == size - 1)
      System.out.println("Stack Full!");
    else
    {
      System.out.print("Enter the value to push: ");
      stack[++top] = in.nextInt();
      System.out.println("Inserted " + stack[top] + " to the stack!");
    }
    in.close();
  }
  
  void pop()
  {
    if(top == -1)
      System.out.println("The stack is Empty!");
    else
    {
      System.out.println("Deleted " + stack[top] + " from the stack!");
      stack[top] = 0;
      top--;
    }
  }
  
  void peek()
  {
    if(top == -1)
      System.out.println("The stack is Empty!");
    else
    {
      System.out.println("Your Stack is 馃憞馃徎");
      for(int i = top; i >= 0; i--)
        System.out.println("|" + stack[i] + "|");
    }
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the size of the stack: ");
    int size = in.nextInt();
    Stack stack = new Stack(size);
    
    int choice;
    do
    {
      System.out.println("\nEnter 1 to Push");
      System.out.println("Enter 2 to Pop");
      System.out.println("Enter 3 to Peek");
      System.out.println("Enter 0 to Exit\n");
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
      switch(choice) 
      {
        case 1:
          stack.push();
          break;
        case 2:
          stack.pop();
          break;
        case 3:
          stack.peek();
          break;
        case 0:
          break;
        default:
          System.err.println("Wrong Input! Try Again...");
      }
    }while(choice != 0);
    
    System.out.print("Program Terminated!");
    in.close();
  }

}
