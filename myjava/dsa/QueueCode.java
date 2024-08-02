package myjava.dsa;

import java.util.LinkedList;
import java.util.Queue;
public class QueueCode
{
  public static void main(String[] args)
  {
    Queue <String> queue = new LinkedList<>();
    
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
    
  }

}
