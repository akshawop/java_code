package myjava.matrix;

import java.util.*;
public class Matrix
{
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
    
    System.out.println("-------------------");
    for(int i = 0; i < rows; i++)
    {
      for(int j = columns - 1; j >= 0; j--)
      {
        if(i == j || i + j + 1 == rows)
          System.out.print(matrix[i][j] + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    in.close();
  }
}