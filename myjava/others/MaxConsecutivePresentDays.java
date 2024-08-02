package myjava.others;

import java.util.Scanner;
public class MaxConsecutivePresentDays
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int noOfStudents;
    do
    {
      System.out.print("Enter the no. of students: ");
      noOfStudents = in.nextInt();
      
      if(noOfStudents <= 0 || noOfStudents > 10)
        System.err.println("Invalid number of students input...");
    }while(noOfStudents <= 0 || noOfStudents > 10);
    
    StringBuffer str = new StringBuffer();
    for(int i = 0; i < noOfStudents; i++)
      str.append('P');
      
    String allPresent = str.toString();
    
    int days;
    do
    {
      System.out.print("Enter the no. of days: ");
      days = in.nextInt();
      
      if(days <= 0 || days > 31)
        System.err.println("Invalid number of days input...");
    }while(days <= 0 || days > 31);
    
    String[] record = new String[days];
    System.out.println("\nEnter the record here...");
    for(int i = 0; i < days; i++)
    {
      System.out.print("Day " + (i + 1) +": ");
      String temp = in.next();
      temp = temp.toUpperCase();
      
      if(temp.length() < noOfStudents || temp.length() > noOfStudents)
      {
        System.err.println("Length should be equal to the number of students...");
        i--;
        continue;
      }
      boolean loopAgain = false;
      for(int x = 0, len = temp.length(); x < len; x++)
      {
        if(temp.charAt(x) != 'P' && temp.charAt(x) != 'A')
        {
          loopAgain = true;
          break;
        }
      }
      if(loopAgain)
      {
        System.err.println("Invalid Input, only P\'s and A\'s are allowed...");
        i--;
        continue;
      }
      
      record[i] = temp;
    }
    
    int max = 0;
    int cons = 0;
    for(int i = 0; i < days; i++)
    {
      if(!record[i].equals(allPresent))
        cons = 0;
      else
        cons++;
        
      if(cons > max)
        max = cons;
    }
    
    System.out.println("\nMax no. of consecutive days, \nwhen all students were present: " + max);
    in.close();
  }
  
}
