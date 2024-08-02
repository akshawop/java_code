package myjava.dsa;

import java.util.LinkedList;

public class LinkedListCode
{

  public static void main(String[] args)
  {
  
    LinkedList <String> list = new LinkedList<>();
    
    list.add("Abhishek");
    list.add("Harsh");
    list.add("Anish");
    list.add("Aniket");
    
    System.out.println(list);
    
    list.add(2, "TSM");
    System.out.println("\n--> list.add(2, \"TSM\");\n" + list);
    
    list.remove(2);
    //or
    //list.remove("TSM");
    System.out.println("\n--> list.remove(2);\n"+ list);
    
    System.out.println("\nPeek First: " + list.peekFirst());
    
    System.out.println("Peek Last: " + list.peekLast());
    
    list.addFirst("TSM");
    System.out.println("\n--> list.addFirst(\"TSM\");\n" + list);
    
    list.addLast("Tojo");
    System.out.println("\n--> list.addLast(\"Tojo\");\n" + list);
    
    list.removeFirst();
    System.out.println("\n--> list.removeFirst();\n" + list);
    
    list.removeLast();
    System.out.println("\n--> list.removeLast();\n" + list);
    
    System.out.println("\n--> list.indexOf(\"Harsh\");\n" + list.indexOf("Harsh"));
    
    
    
    System.out.println();
    
    
    
    // can be used both as a Queue and Stack
    LinkedList <String> queue = new LinkedList<>();
    
    System.out.println("Is Queue empty: " + queue.isEmpty());
    
    queue.offer("Abhishek");
    queue.offer("Harsh");
    queue.offer("Anish");
    queue.offer("Aniket");
    
    System.out.println(queue);
    
    System.out.println("Is Queue empty: " + queue.isEmpty());
    
    System.out.println("Peek: " + queue.peek());
    
    System.out.println("Poll: " + queue.poll());
    
    System.out.println(queue);
    
    System.out.println("Searching \"Aniket\": " + queue.contains("Aniket"));
    
    System.out.println("Searching \"Abhishek\": " + queue.contains("Abhishek"));
    
    System.out.println("Size of queue: " + queue.size());
    
    
    
    System.out.println();
    
    
    
    LinkedList <String> stack = new LinkedList<>();
    
    System.out.println("Is Stack empty: " + stack.isEmpty());
    
    stack.push("Abhishek");
    stack.push("Harsh");
    stack.push("Anish");
    stack.push("Aniket");
    
    System.out.println(stack);
    
    System.out.println("Is Stack empty: " + stack.isEmpty());
    
    System.out.println("Peek: " + stack.peek());
    
    System.out.println("Pop: " + stack.pop());
    
    System.out.println(stack);
    
    System.out.println("Searching \"Aniket\": " + stack.contains("Aniket"));
    
    System.out.println("Searching \"Abhishek\": " + stack.contains("Abhishek"));
    
    
  }

}
