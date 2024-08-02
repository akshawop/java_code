package myjava.oop.student_object_array;

public class Student
{
  public static int numberOfStudents = 0;
  public String name;
  int roll;
  
  Student()
  {
    name = "Default";
    roll = 0;
  }
  
  public Student(String name, int roll)
  {
    this.name = name;
    this.roll = roll; 
    numberOfStudents++; 
  }
  
  public void sayName()
  {
    System.out.println("\n" + name + " says: *Hello! My name is " + name + "*");
  }
}
