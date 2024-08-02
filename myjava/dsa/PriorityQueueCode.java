package myjava.dsa;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueCode
{

  public static void main(String[] args)
  {
    Queue <Integer> pQueue = new PriorityQueue<>();
    
    System.out.println("Is Queue empty: " + pQueue.isEmpty());
    
    pQueue.offer(3);
    pQueue.offer(2);
    pQueue.offer(1);
    pQueue.offer(4);
    
    while(!pQueue.isEmpty())
    {
      System.out.print(pQueue.poll() + " ");
    }
    System.out.println();
    
    pQueue.offer(40);
    pQueue.offer(21);
    pQueue.offer(14);
    pQueue.offer(32);
    
    System.out.println(pQueue);
    
    System.out.println("Is Queue empty: " + pQueue.isEmpty());
    
    System.out.println("Peek: " + pQueue.peek());
    
    System.out.println("Poll: " + pQueue.poll());
    
    System.out.println(pQueue);
    
    System.out.println("Searching \"5\": " + pQueue.contains(5));
    
    System.out.println("Searching \"1\": " + pQueue.contains(1));
    
    System.out.println("Size of queue: " + pQueue.size());
    
  }

}
