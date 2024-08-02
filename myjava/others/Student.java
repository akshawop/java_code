package myjava.others;

// main method in oop/test/MainClassForStudent

public class Student
{
  public static int numberOfStudents = 0;
  public String name;
  int roll;
  
  public Student(String name, int roll)
  {
    this.name = name;
    this.roll = roll;
    numberOfStudents++;
  }
  
  public void sayName()
  {
    System.out.println("\nHi! My name is " + name);
  }
}
