package myjava.others;

import java.util.Scanner;
public class TruthTable
{

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter size: ");
    int n = in.nextInt();
    
    System.out.println();
    int x = 0;
    String array[][] = new String[(int)Math.pow(2, n) + 1][n];
    boolean flag = true;
    char limit = (char) (64 + n);
    for(char ch = limit; ch >= 'A'; ch--)
    {
      array[0][x] = (char)(65 + (limit - ch)) + "";
      int y = 0;
      for(int i = 1; i <= (int)Math.pow(2, n);)
      {
        int j = 1;
        if(flag)
        {
          while(j <= (int)Math.pow(2, ch - 65))
          {
            array[++y][x] = "0";
            i++;
            j++;
          }
          flag = false;
        }
        else
        {
          while(j <= (int)Math.pow(2, ch - 65))
          {
            array[++y][x] = "1";
            i++;
            j++;
          }
          flag = true;
        }
      }
      x++;
    }
    
    for(String[] arr : array)
    {
      for(String element : arr)
        System.out.print(element + "  ");
      System.out.println();
    }
    in.close();
  }

}
