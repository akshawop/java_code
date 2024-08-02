package myjava;

import java.util.Scanner;
class DidiProg
{
String name;
int price;
double dis,amt;

void accept()
{
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the name of the customer:");
  name=in.nextLine();
  System.out.println("Enter the price:"); 
  price=in.nextInt();
  in.close();
}
double discount()
{
  if(price<=25000)
  dis=(5/100.0)*price;
  else if(price>25000 && price<=50000)
  dis=(7.5/100.0)*price;
  else if(price>50000 && price<=100000)
  dis=(10/100.0)*price;
  else
  dis=(15/100.0)*price;
  return dis;
}
void display()
{
  amt=price-dis;
  System.out.println("Name: "+name+"\nDiscount: "+dis+"\nAmount to be paid after Discount: "+amt);
}
  public static void main(String[] args)
  {
    DidiProg ob=new DidiProg();
    ob.accept();
    ob.discount();
    ob.display();
  }
}