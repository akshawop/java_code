package myjava.matrix;

import java.util.*;
public class FillMatrixInClockwise
{

  public static String pad(int x, int value)
  {
    String xStr = "" + x;
    String valueStr = "" + value;
    int length = valueStr.length() - xStr.length();
    String num = "";
    for(int i = 1; i <= length; i++)
      num += " ";
    return num + x;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter rows and columns: ");
    int rows = in.nextInt();
    int columns = in.nextInt();
    
    int matrix[][] = new int[rows][columns];
    
    int i = 0, j = -1, value = 1;
    boolean flag = true, iFlag = true, jFlag = true;
    
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
    
    value--;
    for(int[] row : matrix)
    {
      for(int x : row)
        System.out.print(pad(x, value) + " ");
      System.out.println();
    }
    
    in.close();
  }
}
