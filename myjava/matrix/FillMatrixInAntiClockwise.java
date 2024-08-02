package myjava.matrix;

import java.util.*;
public class FillMatrixInAntiClockwise
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter rows and columns: ");
    int rows = in.nextInt();
    int columns = in.nextInt();
    
    int matrix[][] = new int[rows][columns];
    
    int i = -1, j = 0, value = 1;
    boolean flag = false;
    boolean iFlag = true, jFlag = true;
    
    while(value <= (rows * columns))
    {
      if(flag)
      {
        if(jFlag)
        {
          j++;
          if(j >= columns - 1 || matrix[i][j + 1] != 0)
          {
            jFlag = false;
            flag = false;
          }
        }
        else
        {
          j--;
          if(j <= 0 || matrix[i][j - 1] != 0)
          {
            jFlag = true;
            flag = false;
          }
        }
      }
      else
      {
        if(iFlag)
        {
          i++;
          if(i >= rows - 1 || matrix[i + 1][j] != 0)
          {
            iFlag = false;
            flag = true;
          }
        }
        else
        {
          i--;
          if(i <= 0 || matrix[i - 1][j] != 0)
          {
            iFlag = true;
            flag = true;
          }
        }
      }
      matrix[i][j] = value;
      value++;
    }
    
    for(int[] row : matrix)
    {
      for(int x : row)
        System.out.print(x + " ");
      System.out.println();
    }
    
    in.close();
  }
}
