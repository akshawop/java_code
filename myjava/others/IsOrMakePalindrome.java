package myjava.others;

import java.util.Scanner;
public class IsOrMakePalindrome
{
  public static boolean isPalindrome(String word)
  {
    String revWord = "";
    for(int i = word.length() - 1; i >= 0; i--)
      revWord += word.charAt(i);
    
    return revWord.equals(word);
  }
  
  public static String reverse(String word)
  {
    String revWord = "";
    for(int i = word.length() - 1; i >= 0; i--)
      revWord += word.charAt(i);
    
    return revWord;
  }
  
  public static void main()
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the word: ");
    String word = in.next();
    in.close();
    word = word.toLowerCase();
    
    if(word.length() > 1)
    {
      if(isPalindrome(word))
      {
        System.out.print("Its a palindrome word!");
        return;
      }
    }
    else
    {
      System.out.print("No possible combinations!");
      return;
    }
    
    String palindrome = "", lastChar = "";
    while(word.length() != 0)
    {
      char firstChar = word.charAt(0);
      
      if(word.indexOf(firstChar) != word.lastIndexOf(firstChar))
      {
        palindrome += firstChar;
        word = word.substring(1, word.lastIndexOf(firstChar));
      }
      else
        word = word.substring(1);
        
      if(word.length() == 1)
      {
        lastChar = word;
        word = "";
      }
    }
    
    if(palindrome.length() == 0)
      System.out.print("No possible combinations!");
    else
    {
      palindrome += lastChar + reverse(palindrome);
      System.out.print("--> " + palindrome);
    }
    
  }
}