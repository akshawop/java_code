package myjava.dsa;

import java.util.Hashtable;


public class HashtableCode
{
  public static void main(String[] args)
  {
    Hashtable <String, String> table = new Hashtable<>(11);
    
    table.put("101", "Abhishek");
    table.put("102", "Aniket");
    table.put("103", "Harsh");
    table.put("104", "Anish");
    
    
    table.remove("102");
    
    for(String key : table.keySet())
    {
      System.out.println(key.hashCode() + " " + key.hashCode() % 11 + " " + key + " " + table.get(key));
    }
  }
}
