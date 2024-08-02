package myjava.others;

/*import java.util.*;
import myjava.others.IsOrMakePalindrome;
public class WordCombinations
{

  static String[] combinations;
  static int k = 0;
  
  static void initialize(int size)
  {
    combinations = new String[size];
  }
  
  static boolean isNotPresent(String word)
  {
    for(int i = 0, n = combinations.length; i < n; i++)
    {
      if(word.equals(combinations[i]))
        return false;
    }
    return true;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the word: ");
    String word = in.next();
    word = word.toLowerCase();
    in.close();
    
    int Len = word.length();
    int arrayLength = (int) Math.pow(word.length(), word.length());
    initialize(arrayLength);
    
    //String rev = word.split("").reverse().toString();
    
  //  String[] fundas = {word, rev};
    for(int i = 0, size = fundas.length; i < size; i++)
    {
      for(int j = 0; j < fundas[i].length(); j++)
      {
        String comb = fundas[i].substring(0, j + 1);
        if(isNotPresent(comb))
        {
          combinations[k] = comb;
          k++;
        }
      }
    }
    
    System.out.println("\nAll possible Combinations of " + word + " are:");
    for(int i = 0, n = k; i < n; i++)
      System.out.println("--> " + combinations[i]);
  }

}
*/


class WordCombinations
{
  public static void main(String[] args)
  {
    IsOrMakePalindrome.main();
  }
}