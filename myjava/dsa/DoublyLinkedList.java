package myjava.dsa;

public class DoublyLinkedList
{
  private Node head = null;
  private Node tail = null;
  private int size = 0;
  
  private class Node
  {
    private Node prev;
    public int data;
    private Node next;
    
    private Node(int data)
    {
      prev = null;
      this.data = data;
      next = null;
      
      size++;
    }
  }
  
  public int size()
  {
    return size;
  }
  
  public void add(int data)
  {
    Node newNode = new Node(data);
    
    if(head == null)
    {
      head = newNode;
      tail = newNode;
      return;
    }
    // else
    newNode.prev = tail;
    tail.next = newNode;
    tail = newNode;
  }
  
  // Overload
  public void add(int index, int data)
  {
    if(head == null)
    {
      add(data);
    }
    else
    {
      if(index < 0)
      {
        System.err.println("Incorrect Index Input!");
        return;
      }
      else if(index == 0)
      {
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
        return;
      }
      else if(index >= size)
      {
        add(data);
        return;
      }
      // else
      Node newNode = new Node(data);
      
      Node current;
      if(index <= size / 2)
      {
        int i = 0;
        current = head;
        while(i != index - 1)
        {
          current = current.next;
          i++;
        }
      }
      else
      {
        int i = size;
        current = tail;
        while(i != index - 1)
        {
          current = current.prev;
          i--;
        }
      }
      newNode.prev = current;
      newNode.next = current.next;
      current.next = newNode;
      newNode.next.prev = newNode;
    }
  }
  
  
  public int delete()
  {
    if(head == null)
      return 0;
    else if(size == 1)
    {
      int value = head.data;
      head = null;
      tail = null;
      size--;
      return value;
    }
    // else
    int value = tail.data;
    tail = tail.prev;
    tail.next = null;
    size--;
    return value;
  }
  
  // Overload
  public int delete(int index)
  {
    if(index >= size || index < 0)
    {
      return 0;
    }
    else
    {
      if(size == 1)
      {
        return delete();
      }
      else if(index == 0)
      {
        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
      }
      else if(index == size - 1)
      {
        return delete();
      }
      // else
      Node current;
      if(index <= size / 2)
      {
        int i = 0;
        current = head;
        while(i != index - 1)
        {
          current = current.next;
          i++;
        }
      }
      else
      {
        int i = size;
        current = tail;
        while(i != index - 1)
        {
          current = current.prev;
          i--;
        }
      }
      int value = current.next.data;
      current.next.next.prev = current;
      current.next = current.next.next;
      size--;
      return value;
    }
  }
  
  public void display()
  {
    if(head == null)
    {
      System.out.println("List is Empty!");
      return;
    }
    Node current = head;
    while(current.next != null)
    {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.print(current.data);
    System.out.println();
  }
  
  public void displayReverse()
  {
    if(tail == null)
    {
      System.out.println("List is Empty!");
      return;
    }
    Node current = tail;
    while(current.prev != null)
    {
      System.out.print(current.data + " ");
      current = current.prev;
    }
    System.out.print(current.data);
    System.out.println();
  }
  
}
