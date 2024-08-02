package myjava.others;

import akshawop.util.*;
public class SumWithoutPlusMinus
{

  public static void main(String[] args)
  {
    ErrorFreeInput ak = new ErrorFreeInput();
    
    System.out.print("Enter the first no: ");
    int a = ak.askInt();
    
    System.out.print("Enter the second no: ");
    int b = ak.askInt();
    
    int carry = (a & b) << 1;
    int sum = a ^ b;
    sum = sum | carry;
    
    System.out.print(sum);
  }

}
