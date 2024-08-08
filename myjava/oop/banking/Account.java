import java.util.Scanner;
public class Account extends Bank
{
  double amt;
  Account(String name, String accNum, double principalAmt)
  {
    super(name, accNum, principalAmt);
    amt = 0;
  }
  
  void deposit()
  {
    System.out.println("\nDeposit ₹" + amt + " ... Processing...");
    p += amt;
    System.out.println("Deposited ₹" + amt + "\n");
    System.out.println("Updated Details --->");
    display();
  }
  
  void withdraw()
  {
    System.out.println("\nWithdraw ₹" + amt + " ... Processing...");
    if(amt >= p)
      System.out.println("WITHDRAWAL FAILED DUE TO \nINSUFFICIENT BALANCE!\n");
    else
    {
      p -= amt;
      System.out.println("Withdrew ₹" + amt + "\n");
      
      if(p < 500)
      {
        double penalty = (500 - p) / 10;
        p = p - penalty;
        System.out.println("Your Account balance is below ₹500!\nPenalty of ₹" + penalty +" has been deducted from your account!\n");
      }
    }
    System.out.println("Updated Details --->");
    display();
  }
  
  void display()
  {
    super.display();
  }
  
  public static void main(String[] args)
  {
    Account acc = new Account("Abhishek Shaw", "58970200000120", 2000);
    acc.display();
    
    Scanner in = new Scanner(System.in);
    int choice;
    do
    {
      System.out.println("Enter 1 to DEPOSIT");
      System.out.println("Enter 2 to WITHDRAW");
      System.out.println("Enter 0 to EXIT");
      choice = in.nextInt();
      switch(choice)
      {
        case 1:
          System.out.print("Enter the Deposit Amount: ₹");
          acc.amt = in.nextDouble();
          acc.deposit();
          break;
        case 2:
          System.out.print("Enter the Withdrawal Amount: ₹");
          acc.amt = in.nextDouble();
          acc.withdraw();
          break;
        case 0:
          System.out.println("Exited!");
          break;
        default:
          System.err.println("Invalid Choice!");
      }
    }while(choice != 0);
    in.close();
  }
}