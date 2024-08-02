package myjava.oop.shop;

import java.util.*;
public class Purchase extends Stock
{
  int pqty;
  double prate;
  
  Purchase(String name, double rate, int quantity)
  {
    super(name, rate, quantity);
    pqty = quantity;
    prate = rate;
  }
  
  void update(double rate, int pQuantity)
  {
    super.rate = rate;
    qt = qt + pQuantity;
    amt = rate * qt;
    display();
  }
  
  void display()
  {
    super.display();
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the name of the product: ");
    String name = in.next();
    
    System.out.print("Enter the rate of the product: ₹");
    double rate = in.nextDouble();
    
    System.out.print("Enter the existing quantity of the product: ");
    int quantity = in.nextInt();
    System.out.println();
    
    Purchase ob = new Purchase(name, rate, quantity);
    
    int choice;
    do
    {
      System.out.println("Enter 1 to update stock");
      System.out.println("Enter 0 to exit");
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
      System.out.println();
      switch(choice)
      {
        case 1:
          System.out.print("Enter new Rate: ₹");
          rate = in.nextDouble();
          
          System.out.print("Enter the purchased quantity: ");
          quantity = in.nextInt();
          ob.update(rate, quantity);
          break;
        case 0:
          System.out.println("Exited!");
          break;
        default:
          System.out.println("Wrong Choice!");
      }
    }while(choice != 0);
    in.close();
  }
}