package myjava.matrix;

import java.util.*;
public class OptionalMatrixPatterns
{
  static void patternMaker(int choice, int size, int x, int y, int matrix[][])
  {
    for(int i = 0; i < size; i++)
          {
            for(int j = 0; j < size; j++)
            {
              if(choice == 1 || choice == 3)
                if(Math.abs(x - j) < Math.abs(y - i))
                  System.out.print(matrix[i][j] + " ");
              if(choice == 2 || choice == 4)
                if(Math.abs(x - j) > Math.abs(y - i))
                  System.out.print(matrix[i][j] + " ");
              else
                System.out.print("  ");
            }
            System.out.println();
          }
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number for rows and columns");
    int size = in.nextInt();
    System.out.println("Enter a " + size + "X" + size + " matrix:");
    
    int matrix[][] = new int [size][size];
    
    for(int i = 0; i < size; i++)
      for(int j = 0; j < size; j++)
        matrix[i][j] = in.nextInt();
    
    System.out.println("Enter 1 to print upper left portion");
    System.out.println("Enter 2 to print upper right portion");
    System.out.println("Enter 3 to print lower left portion");
    System.out.println("Enter 4 to print lower right portion");
    System.out.println("Enter 0 to exit");
    
    int choice;
    do
    {
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
      if(choice == 1 || choice == 4)
        patternMaker(choice, size, 0, size - 1, matrix);
      else if(choice == 2 || choice == 3)
          patternMaker(choice, size, 0, 0, matrix);
      else if(choice == 0)
        System.out.println("Exit!");
      else
        System.err.println("Wrong Choice!");
    }while(choice != 0);
    in.close();
  }
}