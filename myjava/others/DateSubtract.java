package myjava.others;

//import java.util.*;
public class DateSubtract
{
  static String fromDate = "";
  static String toDate = "";
  
 // static String errorFreeDateInput()
  {
    
  }
  
  static int getYear(String date)
  {
    int year = Integer.parseInt(date.substring(date.lastIndexOf('/') + 1));
    return year;
  }
  
  static int getMonth(String date)
  {
    int month = Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/')));
    return month;
  }
  
  static int getDay(String date)
  {
    int day = Integer.parseInt(date.substring(0, date.indexOf('/')));
    return day;
  }
  
  public static void main(String[] args)
  {
    //fromDate = errorFreeDateInput();
   // toDate = errorFreeDateInput();
    
   // if(getYear(fromDate) > getYear(toDate) || getMonth(fromDate) > getMonth(toDate) || getDay(fromDate) > getDay(toDate))
    {
     // if()
      {
       // if()
        {
          
        }
      }
    }
    
  }

}