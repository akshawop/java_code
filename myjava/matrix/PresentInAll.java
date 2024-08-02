package myjava.matrix;

import java.util.*;
public class PresentInAll
{
  public static void main(String[] args) 
  {
     Scanner in=new Scanner(System.in);
     
     System.out.println("Enter the rows and columns");
     int rows = in.nextInt();
     int columns = in.nextInt();
     int matrix[][] = new int[rows][columns];
     
     System.out.println("Enter the elements");
     for(int i = 0; i < rows; i++)
      for(int j = 0; j < columns; j++)
       matrix[i][j] = in.nextInt(); 
      
     int firstRow[] = new int[columns];
     for(int i = 0; i < columns; i++)
       firstRow[i] = matrix[0][i];
     
     String commonNumbers = "";
     for(int k = 0; k < columns; k++)
     {
       int c = 1;
       for(int i = 1; i < rows; i++)
       {
         for(int j = 0; j < columns; j++)
         {
           if(matrix[i][j] == firstRow[k])
           {
             c++;
             break;
           }
         }
       }
       if(c == columns)
         commonNumbers += firstRow[k] + " ";
     }
     
     if(commonNumbers.length() == 0)
       System.out.println("No common numbers found!");
     else
       System.out.print("Common Numbers are: " + commonNumbers);
     
     in.close();
}
}