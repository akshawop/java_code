import java.util.*;
public class SortRows
{
  static int[][] matrix;
  static int rows, columns;
  
  static void sort(int row)
  {
    for(int i = 0; i < columns; i++)
    {
      for(int j = 0; j < columns; j++)
      {
        if(matrix[row][i] < matrix[row][j])
        {
          int temp = matrix[row][i];
          matrix[row][i] = matrix[row][j];
          matrix[row][j] = temp;
        }
      }
    }
  }
  
  static void display()
  {
    System.out.println();
    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
        
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Define the rows and columns: ");
    rows = in.nextInt();
    columns = in.nextInt();
    
    matrix = new int[rows][columns];
    
    System.out.println("Enter the elements:");
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < columns; j++)
        matrix[i][j] = in.nextInt();
        
    for (int i = 0; i < rows; i++)
    {
      sort(i);
    }
    display();
    in.close();
  }

}
