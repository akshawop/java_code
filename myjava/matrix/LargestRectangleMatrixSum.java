import java.util.*;
public class LargestRectangleMatrixSum
{
  static int sumOfElements(int matrix[][], int rows, int columns)
  {
    int sum = 0;
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
        sum += matrix[i][j];
    
    return sum;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter rows and columns: ");
    int rows = in.nextInt();
    int columns = in.nextInt();
    
    int x, y, yIterate;
    if(rows == columns)
    {
      y = rows - 2;
      yIterate = 3;
    }
    else
    {
      y = rows - 1;
      yIterate = 2;
    }
    
    x = columns - 1;
    
    int matrix[][] = new int[rows][columns];
    int targetMatrix[][] = new int[y][x];
    int largestSumMatrix[][] = new int[y][x];
    
    System.out.println("Enter the elements:");
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
        matrix[i][j] = in.nextInt();
        
    for(int row = 0; row < yIterate; row++)
    {
      for(int column = 0; column <= 1; column++)
      {
       
        int a = 0;
        for(int i = row; i <= rows - yIterate + row; i++)
        {
          int b = 0;
          for(int j = column; j < columns - 1 + column; j++)
          {
            targetMatrix[a][b] = matrix[i][j];
            b++;
          }
          a++;
        }
        
        if(sumOfElements(targetMatrix, y, x) > sumOfElements(largestSumMatrix, y, x))
        {
          largestSumMatrix = targetMatrix;
          System.out.println(sumOfElements(targetMatrix, y, x) + " > " + sumOfElements(largestSumMatrix, y, x));
        }
        else
          System.out.println(sumOfElements(targetMatrix, y, x) + " < " + sumOfElements(largestSumMatrix, y, x));
      }
    }
    
    System.out.println("\nMatrix -->");
    for(int i = 0; i < y; i++)
    {
      for(int j = 0; j < x; j++)
        System.out.print(largestSumMatrix[i][j] + " ");
      System.out.println();
    }
    System.out.print("Sum of Matrix --> " + sumOfElements(largestSumMatrix, y, x));
    in.close();
  }
}