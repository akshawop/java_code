import java.util.*;
public class MatrixProduct
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int rows1, columns1, rows2, columns2;
    do
    {
      System.out.println("Enter rows and columns for matrix 1:");
      rows1 = in.nextInt(); 
      columns1 = in.nextInt();
    
      System.out.println("Enter rows and columns for matrix 2:");
      rows2 = in.nextInt();
      columns2 = in.nextInt();
      if (columns1 != rows2)
        System.err.println("C1 should be equal to R2");
    } while(columns1 != rows2);
    
    int matrix1[][] = new int[rows1][columns1];
    int matrix2[][] = new int[rows2][columns2];
    int matrix[][] = new int[rows1][columns2];
    
    System.out.println();
    System.out.println("Enter the elements of matrix 1:");
    for(int i = 0; i < rows1; i++)
      for(int j = 0; j < columns1; j++)
        matrix1[i][j] = in.nextInt();
    
    System.out.println("Enter the elements of matrix 2:");
    for(int i = 0; i < rows2; i++)
      for(int j = 0; j < columns2; j++)
        matrix2[i][j] = in.nextInt();
    
    for(int i = 0; i < rows1; i++)
    {
      for(int j = 0; j < columns2; j++)
      {
        for(int k = 0; k < columns1; k++)
          matrix[i][j] += matrix1[i][k] * matrix2[k][j];
      }
    }
    
    System.out.println();
    System.out.println("Product of Matrices:");
    for(int i = 0; i < rows1; i++)
    {
      for(int j = 0; j < columns2; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
    
    in.close();
  }
}