package myjava.others;

import java.util.*;
public class Swapping
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        int matrix[][] = new int[size][size];

        System.out.println("Enter the elements:");
        int i, j;
        for(i = 0; i < size; i++)
            for(j = 0; j < size; j++)
                matrix[i][j] = in.nextInt();
                
        int k = size - 1;
        for(i = 0; i < size - 1; i++)
        {
            int l = size - 1;
            for(j = 0; j < size - 1 - i; j++)
            {
                matrix[j][i] += matrix[k][l];
                matrix[k][l] = matrix[j][i] - matrix[k][l];
                matrix[j][i] -= matrix[k][l];
                l--;
            }
            k--;
        }

        System.out.println("---------------------------------");
        for(i = 0; i < size; i++)
        {
            for(j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        in.close();
    }
}