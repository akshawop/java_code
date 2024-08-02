package myjava.oop.students_rank_records;

public class Rank extends Record
{
  int index;
  Rank()
  {
    super();
    index = 0;
  }
  
  void highest()
  {
    for(int i = 0; i < k; i++)
      if(mk[index] < mk[i])
        index = i;
  }
  
  void display()
  {
    super.display();
    System.out.println("\nHighest Rank:");
    System.out.println(names[index] + " -----> " + mk[index]);
  }
  
  public static void main(String[] args)
  {
    Rank rank = new Rank();
    
    rank.readValues("Aniket", 257);
    rank.readValues("Anish", 256);
    rank.readValues("Harsh", 258);
    rank.readValues("Abhishek", 255);
    
    rank.highest();
    rank.display();
  }
}
