package myjava.oop.test;

import java.util.Scanner;
public class AddTwoMatrixOP
{
  int[][] matrix;
  static int[][] addedMatrix;
  static int rows, columns;
  AddTwoMatrixOP()
  {
    matrix = new int[rows][columns];
  }
  
  void input()
  {
    Scanner in = new Scanner(System.in);
    
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
        matrix[i][j] = in.nextInt();
    System.out.println();
    in.close();
  }
  
  static void add(AddTwoMatrixOP mat1, AddTwoMatrixOP mat2)
  {
    addedMatrix = new int[rows][columns];
    
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
      addedMatrix[i][j] = mat1.matrix[i][j] + mat2.matrix[i][j];
  }
  
  static void display(AddTwoMatrixOP mat)
  {
    for(int[] arr : mat.matrix)
    {
      for(int x : arr)
        System.out.print(x + " ");
      System.out.println();
    }
  }
  
  static void displayAdded()
  {
    for(int[] arr : addedMatrix)
    {
      for(int x : arr)
        System.out.print(x + " ");
      System.out.println();
    }
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the dimensions: ");
    rows = in.nextInt();
    columns = in.nextInt();
    in.close();
    
    AddTwoMatrixOP mat1 = new AddTwoMatrixOP();
    AddTwoMatrixOP mat2 = new AddTwoMatrixOP();
    
    System.out.println("Enter the elements for matrix 1:");
    mat1.input();
    
    System.out.println("Enter the elements for matrix 2:");
    mat2.input();
    
    System.out.println("Result:");
    add(mat1, mat2);
    
    System.out.println("\nOriginal Matrix 1:");
    display(mat1);
    
    System.out.println("\nOriginal Matrix 2:");
    display(mat2);
    
    System.out.println("\nAdded Matrix:");
    displayAdded();
  }

}
