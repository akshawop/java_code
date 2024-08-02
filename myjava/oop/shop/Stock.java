package myjava.oop.shop;

public class Stock
{
  String item;
  int qt;
  double rate;
  double amt;
  
  Stock(String name, double rate, int quantity)
  {
    item = name;
    qt = quantity;
    this.rate = rate;
    amt = rate * quantity;
  }
  
  void display()
  {
    System.out.println();
    System.out.println(item + " ---->");
    System.out.println("Rate: ₹" + rate);
    System.out.println("Quantity: " + qt);
    System.out.println("Stock Valuation: ₹" + amt);
    System.out.println();
  }
}