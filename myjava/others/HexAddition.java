package myjava.others;

import java.util.Scanner;
public class HexAddition
{
  static final String VALID_HEX = "0123456789ABCDEF";
  
  public static String inputHex(String msg)
  {
    Scanner in = new Scanner(System.in);
    
    String hex;
    boolean isValid = false;
    do
    {
      System.out.print(msg);
      hex = in.next().toUpperCase();
      isValid = validate(hex);
      if(!isValid)
        System.err.println("Invalid input...");
    }while(!isValid);
    in.close();
    
    return hex;
  }
  
  public static boolean validate(String hex)
  {
    for(int i = 0, len = hex.length(); i < len; i++)
      if(VALID_HEX.indexOf(hex.charAt(i)) == -1)
        return false;
        
    return true;
  }
  
  public static String pad(int len)
  {
    StringBuffer zero = new StringBuffer();
    
    for(int i = 1; i <= len; i++)
      zero.append('0');
      
    return zero.toString();
  }
  
  public static String hexAdd(String hex1, String hex2)
  {
    StringBuffer hex = new StringBuffer();
    int carry = 0;
    
    for(int i = hex1.length() - 1; i >= 0; i--)
    {
      int sum = carry + VALID_HEX.indexOf(hex1.charAt(i)) + VALID_HEX.indexOf(hex2.charAt(i));
      carry = 0;
      if(sum > 15)
      {
        carry = 1;
        sum -= 16;
      }
      hex.insert(0, VALID_HEX.charAt(sum));
    }
    if(carry != 0)
      hex.insert(0, VALID_HEX.charAt(carry));
    
    return hex.toString();
  }
  
  public static void printDash(int size)
  {
    for(int i = 0; i < size; i++)
      System.out.print("-");
      
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    String hex1 = inputHex("Value 1 --> ");
    
    String hex2 = inputHex("Value 2 --> ");
    
    hex1 = pad(hex2.length() - hex1.length()) + hex1;
    
    hex2 = pad(hex1.length() - hex2.length()) + hex2;
    
    System.out.println("\n  " + hex1);
    System.out.println("+ " + hex2);
    String hexSum = hexAdd(hex1, hex2);
    printDash(hexSum.length() + 3);
    System.out.println(" " + (hexSum.length() == hex1.length() ? " " : "") + hexSum);
    printDash(hexSum.length() + 3);
  }

}
