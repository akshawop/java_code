package myjava.matrix;

import java.util.*;
public class MagicSquareMatrix
{
  static boolean hasSameRowsAndColumnSum(int matrix[][], int sum)
  {
    int size = matrix.length;
    int rowSum = 0;
    int columnSum = 0;
    for(int i = 0; i < size; i++)
    {
      for(int j = 0; j < size; j++)
      {
        rowSum += matrix[i][j];
        columnSum += matrix[j][i];
      }
      if(rowSum != sum || columnSum != sum)
        return false;
      rowSum = 0;
      columnSum = 0;
    }
    return true;
  }
  
  static boolean hasSameDiagonalSum(int matrix[][], int sum)
  {
    int size = matrix.length;
    int diagonalSum = 0;
    for(int i = 0; i < size; i++)
      diagonalSum += matrix[i][i];
    
    if(diagonalSum != sum)
      return false;
    
    diagonalSum = 0;
    int i = 0;
    for(int j = size - 1; j >= 0; j--)
      diagonalSum += matrix[i++][j];
      
    if(diagonalSum != sum)
      return false;
      
    return true;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
      System.out.println("Enter the size:");
      int size = in.nextInt();
    
    int matrix[][] = new int[size][size];
    System.out.println("Enter the Elements:");
    for(int i = 0; i < size; i++)
      for(int j = 0; j < size; j++)
        matrix[i][j] = in.nextInt();
    
    int firstRowSum = 0;  
    for(int i = 0; i < size; i++)
      firstRowSum += matrix[0][i];
      
    if(hasSameRowsAndColumnSum(matrix, firstRowSum) && hasSameDiagonalSum(matrix, firstRowSum))
      System.out.print("It's a Magic Square Matrix!");
    else
      System.err.print("It's not a Magic Square Matrix..");
      
    in.close();
  }

}
