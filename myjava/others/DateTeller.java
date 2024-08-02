package myjava.others;

import java.util.*;
public class DateTeller
{
  static int errorFreeIntInput()
  {
    Scanner in = new Scanner(System.in);
    int input = 0;
    try
    {
      input = in.nextInt();
      in.close();
      if(input <= 0)
      {
        input = 0;
        throw new Exception("Error");
      }
    }
    catch(Exception error)
    {
      System.err.println("Wrong Input! Try Again...\n");
    }
    return input;
  }
  
  static String dateOf(int year, int days)
  {
    while(days > 365)
    {
      if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
      {
        if(days > 366)
        {
          days -= 366;
          year++;
        }
        else break;
      }
      else
      {
        if(days > 365)
        {
          days -= 365;
          year++;
        }
        else break;
      }
      
    }
    
    final String MONTH_NAMES[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String date = "";
    int month;
    for(month = 1; month <= 12; month++)
    {
      int febDays = 28;
      if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        febDays = 29;
        
      if(month == 2 && days > febDays || (month == 4 || month == 6 || month == 9 || month == 11) && days > 30 || days > 31)
        days -= numberOfDays(month, year);
      else
      {
        date = MONTH_NAMES[month - 1] + " " + days + ", " + year;
        break;
      }
    }
    
    return date;
  }
  
  static int numberOfDays(int month, int year)
  {
    if(month == 4 || month == 6 || month == 9 || month == 11)
      return 30;
    else if(month == 2)
    {
      int days = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
      return days;
    }
    else
      return 31;
  }
  
  public static void main(String[] args)
  {
    int year = 0, days = 0, afterDays = 0;
    while(year == 0)
    {
      System.out.print("Enter the Year: ");
      year = errorFreeIntInput();
    }
    
    while(days == 0)
    {
      System.out.print("Enter the number of days: ");
      days = errorFreeIntInput();
    }
    
    System.out.println(dateOf(year, days));
    
    while(afterDays == 0)
    {
      System.out.print("Date After days: ");
      afterDays = errorFreeIntInput();
    }
    
    System.out.println(dateOf(year, days + afterDays));
  }
}