package myjava.dsa;

public class SinglyLinkedList
{
  private Node head = null; // Represent the head of the singly linked list
  private Node tail = null; // Represent the tail of the singly linked list
  
  private int size = 0; // Stores the number of elements in the list
  
  private class Node // class to create nodes
  {
    public int data;
    private Node next;
    
    private Node(int value) // node constructor
    {
      data = value;
      next = null;
      size++;
    }
  }
  
  
  
  
  public int size() // get the size of the list
  {
    return size;
  }
  
  
  
  
  public void add(int data) // add() will add a new node to the list
  {
    Node newNode = new Node(data); // Create a new node
    
    if(head == null) //Checks if the list is empty
    {
      head = newNode; // If list is empty, both head and tail will point to new node
      tail = newNode;
      return;
    }
    // else
    tail.next = newNode; // newNode will be added after tail such that tail's next will point to newNode
    tail = newNode; // newNode will become new tail of the list
  }
  
  // Overloading
  public void add(int index, int data) // add(x, y) will add a new node at the index x in the list
  {
    if(head == null) // Checks if the list is empty
    {
      add(data);
    }
    else
    {
      if(index < 0) // checks for invalid index
      {
        System.err.println("Incorrect Index Input!");
        return;
      }
      else if(index == 0) // adding a node at the start of the list
      {
        Node newNode = new Node(data); // Create a new node
        
        newNode.next = head;
        head = newNode;
        return;
      }
      else if(index >= size) // if the index is greater than the size of the list, add a node at the end
      {
        add(data);
        return;
      }
      // else add a node at the index
      Node newNode = new Node(data); // Create a new node
        
      int i = 0;
      Node current = head;
      while(i != index - 1)
      {
        current = current.next;
        i++;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }
  
  
  
  
  public int delete() // delete() will delete a node from the end of the list
  {
    if(head == null) // if the list is empty do nothing
      return 0;
    else if(size == 1) // if it is the last element, set head and tail to null
    {
      int value = head.data;
      head = null;
      tail = null;
      size--;
      return value;
    }
    // else
    int i = 0;
    Node current = head;
    while(i != size - 2)
    {
      current = current.next;
      i++;
    }
    tail = current;
    int value = current.next.data;
    current.next = null;
    size--;
    return value;
  }
  
  // Overloading
  public int delete(int index) // delete(x) will delete the node at index x of the list
  {
    if(index >= size || index < 0) // if the index is invalid the do nothing
    {
      return 0;
    }
    else
    {
      if(size == 1)
      {
        return delete();
      }
      else if(index == 0) // if first node is being deleted
      {
        int value = head.data;
        head = head.next;
        size--;
        return value;
      }
      else if(index == size - 1) // call the delete() method to if last node needs to be deleted
      {
        return delete();
      }
      // else deleting any node in between
      int i = 0;
      Node current = head;
      while(i != index - 1)
      {
        current = current.next;
        i++;
      }
      int value = current.next.data;
      Node nextNode = current.next;
      current.next = nextNode.next;
      size--;
      return value;
    }
  }
  
  
  
  
  public void display() // display() will display all the nodes present in the list
  {
    if(head == null) // if node is empty, display empty list
    {
      System.out.println("List is empty");
      return;
    }
    // else
    Node current = head; // Node current will point to head
    System.out.println("Nodes of singly linked list: ");
    while(current != null) // Prints each node by incrementing pointer
    {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
  
  
}
