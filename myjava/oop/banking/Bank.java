public class Bank
{
  String name;
  String accno;
  double p;
  
  Bank(String name, String accNum, double principalAmt)
  {
    this.name = name;
    accno = accNum;
    p = principalAmt;
  }
  
  void display()
  {
    System.out.println("Holder Name: " + name);
    System.out.println("Account No: " + accno);
    System.out.printf("Account Balance: ₹%.3f\n\n", p);
  }
}