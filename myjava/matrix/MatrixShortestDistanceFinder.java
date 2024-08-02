package myjava.matrix;

import java.util.Scanner;
public class MatrixShortestDistanceFinder
{
  static int rowS, columnS;
  static int rowN, columnN;
  static int shortestPath()
  {
    int path = 0;
    while(!(rowS == rowN && columnS == columnN))
    {
      if(rowS < rowN)
        rowS++;
      else if(rowS > rowN)
        rowS--;
      
      if(columnS < columnN)
        columnS++;
      else if(columnS > columnN)
        columnS--;
        
      path++;
    }
    return path;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the dimensions: ");
    int rows = in.nextInt();
    int columns = in.nextInt();
    
    int[][] matrix = new int[rows][columns];
    
    System.out.println("Enter the elements:");
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
        matrix[i][j] = in.nextInt();
    
    System.out.print("Enter the element to find: ");
    int toFind = in.nextInt();
    
    System.out.print("Enter the starting index: ");
    rowS = in.nextInt();
    columnS = in.nextInt();
    
    int nearest = rows * columns;
    for(int i = 0; i < rows; i++)
    {
      for(int j = 0; j < columns; j++)
      {
        if(matrix[i][j] == toFind)
        {
          int address = Math.abs(rowS - i) + Math.abs(columnS - j);
          if(address < nearest)
          {
            rowN = i;
            columnN = j;
            nearest = address;
          }
        }
      }
    }
        
    System.out.println("Min Steps to find: " + shortestPath());
    in.close();
  }

}
