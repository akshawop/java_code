package myjava.dsa;

import java.util.ArrayList;
import java.util.Scanner;
public class CommonElementsArrayList
{
  public static void input(ArrayList<String> list, int size)
  {
    Scanner in = new Scanner(System.in);
    
    for(int i = 0; i < size; i++)
      list.add(in.next());
      
   in.close();
  }
  
  public static String common(ArrayList<String> list1, ArrayList<String> list2)
  {
    ArrayList<String> common = new ArrayList<>(list1.size());
    
    int l1size = list1.size();
    int l2size = list2.size();
    
    int i = 0;
    while(i < l1size)
    {
      int j = 0;
      while(j < l2size)
      {
        if(list1.get(i).equals(list2.get(j)))
        {
          common.add(list1.get(i));
          break;
        }
        j++;
      }
      i++;
    }
    
   return common.toString();
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the no. of inputs: ");
    int l1size = in.nextInt();
    
    System.out.print("Enter the no. of inputs: ");
    int l2size = in.nextInt();
    
    in.close();
    
    ArrayList<String> list1 = new ArrayList<>(l1size);
    ArrayList<String> list2 = new ArrayList<>(l2size);
    
    System.out.println("Enter the Elements:");
    input(list1, l1size);
    
    System.out.println("Enter the Elements:");
    input(list2, l2size);
    
    System.out.print("Common Elements are: " + common(list1, list2));
  }

}
