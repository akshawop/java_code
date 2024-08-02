package myjava.dsa;

import java.util.Stack;
public class StackCode
{
  public static void main(String[] args)
  {
    Stack <String> stack = new Stack<>();
    
    System.out.println("Is Stack empty: " + stack.empty());
    
    stack.push("Abhishek");
    stack.push("Harsh");
    stack.push("Anish");
    stack.push("Aniket");
    
    System.out.println(stack);
    
    System.out.println("Is Stack empty: " + stack.empty());
    
    System.out.println("Peek: " + stack.peek());
    
    System.out.println("Pop: " + stack.pop());
    
    System.out.println(stack);
    
    System.out.println("Searching \"Aniket\": " + stack.search("Aniket"));
    
    System.out.println("Searching \"Abhishek\": " + stack.search("Abhishek"));
  }

}
