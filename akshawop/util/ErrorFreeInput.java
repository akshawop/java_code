package akshawop.util;

import java.util.Scanner;
public class ErrorFreeInput
{
  static String invalidMessage = "Invalid Input! Try Again...\n";
  static String inputMarker = "-> ";
  // Boolean
  public boolean askBoolean()
  {
    boolean input = false;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        input = in.nextBoolean();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return input;
  }

  // Byte
  public byte askByte()
  {
    byte number = 0;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        number = in.nextByte();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return number;
  }
  
  // Short
  public short askShort()
  {
    short number = 0;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        number = in.nextShort();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return number;
  }
  
  // Integer
  public int askInt()
  {
    int number = 0;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return number;
  }
  
  // Long
  public long askLong()
  {
    long number = 0;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        number = in.nextLong();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return number;
  }
  
  // Float
  public float askFloat()
  {
    float number = 0.0f;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        number = in.nextFloat();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return number;
  }
  
  // Double
  public double askDouble()
  {
    double number = 0.0;
    boolean hasError = true;
    do
    {
      try
      {
        Scanner in = new Scanner(System.in);
        number = in.nextDouble();
        in.close();
        hasError = false;
      }
      catch(Exception err)
      {
        System.err.print(invalidMessage);
        System.out.print(inputMarker);
      }
    }while (hasError);
    
    return number;
  }
  
  // Character
  public char askChar()
  {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    in.close();
    return ch;
  }
  
  // Word
  public String askWord()
  {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    in.close();
    return str;
  }
  
  // Line
  public String askLine()
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    in.close();
    return str;
  }
  
}
