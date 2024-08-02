package myjava.others;

import java.util.Scanner;
public class CommonWordsDisplay
{
  public static void main(String[] args)
  {
   String input1, input2;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter two sentences:");
   input1 = in.nextLine(); 
   input2 = in.nextLine(); 
   String arrOne[] = input1.split(" ");
   String arrTwo[] = input2.split(" "); 
   String result[] = new String[arrOne.length + arrTwo.length];
   
   
     for(int i = 0; i < arrTwo.length; i++) 
     {
       for(int j = 0; j < arrOne.length; j++)
       {
         if(arrTwo[i].equalsIgnoreCase(arrOne[j]))
         {
          result[i] = arrTwo[i];
          break;
         }
       }
     }
   
   for(int k = 0; k < result.length; k++) 
   {
    if(result[k] != null) 
    System.out.println(result[k] + " ");
    else
    continue;
   }
   in.close();
  }
}
