package myjava.matrix;

import java.util.*;
public class PeakElement
{
  static boolean isPeak(int matrix[][], int rows, int columns, int i, int j)
  {
    int test = 0;
    
    if(i == 0)
    {
      int y;
      if(i == rows - 1)
        y = matrix[i][j];
      else
        y = Math.max(matrix[i][j], matrix[i + 1][j]);
      
      if(y == matrix[i][j])
        test++;
    }
    else if(i == rows - 1)
    {
      int y = Math.max(matrix[i][j], matrix[i - 1][j]);
      if(y == matrix[i][j])
        test++;
    }
    else
    {
      int y = Math.max(Math.max(matrix[i][j], matrix[i - 1][j]), matrix[i + 1][j]);
      if(y == matrix[i][j])
        test++;
    }
    
    
    if(j == 0)
    {
      int x;
      if(j == columns - 1)
        x = matrix[i][j];
      else
        x = Math.max(matrix[i][j], matrix[i][j + 1]); 
      if(x == matrix[i][j])
        test++;
    }
    else if(j == columns - 1)
    {
      int x = Math.max(matrix[i][j], matrix[i][j - 1]);
      if(x == matrix[i][j])
        test++;
    }
    else
    {
      int x = Math.max(Math.max(matrix[i][j], matrix[i][j - 1]), matrix[i + 1][j]);
      if(x == matrix[i][j])
        test++;
    }
    
    if(test == 2)
      return true;
    return false;
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter rows and columns: ");
    int rows = in.nextInt();
    int columns = in.nextInt();
    
    int matrix[][] = new int[rows][columns];
    
    System.out.println("Enter the elements:");
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
        matrix[i][j] = in.nextInt();
    
    if(rows == 1 && columns == 1)
      System.out.println(matrix[0][0] + " --> (0, 0)");
    else
    {
      for(int i = 0; i < rows; i++)
      {
        for(int j = 0; j < columns; j++)
        {
          if(isPeak(matrix, rows, columns, i, j))
            System.out.println(matrix[i][j] + " --> (" + i + ", " + j + ")");
        }
      }
    }
    in.close();
  }
}
