package myjava.oop.students_rank_records;

public class Record
{
  String names[];
  int mk[];
  int k;
  
  Record()
  {
    names = new String[50];
    mk = new int[50];
    k = 0;
  }
  
  void readValues(String name, int marks)
  {
    names[k] = name;
    mk[k] = marks;
    k++;
  }
  
  void display()
  {
    System.out.println("Names & Marks\n");
    for(int i = 0; i < k; i++)
      System.out.println(names[i] + " -----> " + mk[i]);
  }
  
}