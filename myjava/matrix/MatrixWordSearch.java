package myjava.matrix;

import java.util.Scanner;
public class MatrixWordSearch
{
  static char[][] matrix;
  static String word;
  static int rows, columns;
  static int i, j, foundChar = 0;
  
  static boolean up(char ch)
  {
    if(i - 1 < 0)
      return false;
      
    char nextChar = matrix[i - 1][j];
    if(nextChar == ch)
      return true;
    return false;
  }
  
  static boolean down(char ch)
  {
    if(i + 1 >= rows)
      return false;
      
    char nextChar = matrix[i + 1][j];
    if(nextChar == ch)
      return true;
    return false;
  }
  
  static boolean left(char ch)
  {
    if(j - 1 < 0)
      return false;
      
    char nextChar = matrix[i][j - 1];
    if(nextChar == ch)
      return true;
    return false;
  }
  
  static boolean right(char ch)
  {
    if(j + 1 >= columns)
      return false;
      
    char nextChar = matrix[i][j + 1];
    if(nextChar == ch)
      return true;
    return false;
  }
  
  static boolean searchNext()
  {
    if(foundChar == word.length())
      return true;
      
    char wordChar = word.charAt(foundChar);
    
    if(up(wordChar))
    {
      i--;
      foundChar++;
      if(searchNext()) return true;
        
      foundChar = 1;
    }
    
    else if(down(wordChar))
    {
      i++;
      foundChar++;
      if(searchNext()) return true;
        
      foundChar = 1;
    }
    
    if(left(wordChar))
    {
      j--;
      foundChar++;
      if(searchNext()) return true;
        
      foundChar = 1;
    }
    
    else if(right(wordChar))
    {
      j++;
      foundChar++;
      if(searchNext()) return true;
      
      foundChar = 1;
    }
    
    return false;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the dimensions: ");
    rows = in.nextInt();
    columns = in.nextInt();
    
    matrix = new char[rows][columns];
    System.out.println("Enter the characters:");
    for(int x = 0; x < rows; x++)
      for(int y = 0; y < columns; y++)
        matrix[x][y] = Character.toUpperCase(in.next().charAt(0));
        
    System.out.print("Enter the word to search: ");
    word = in.next().toUpperCase();
    
    boolean isFound = false;
    
    outer:
    for(int x = 0; x < rows; x++)
    {
      for(int y = 0; y < columns; y++)
      {
        if(matrix[x][y] == word.charAt(0))
        {
          foundChar++;
          i = x;
          j = y;
          if(searchNext())
          {
            isFound = true;
            break outer;
          }
          else
            foundChar = 0;
        }
      }// inner loop end
    }// outer loop end
    
    System.out.println(isFound);
    in.close();
  }

}