package myjava.oop.test;

import java.util.Scanner;
import myjava.others.Student;

public class MainClassForStudent
{ 
  static void println(String string)
  {
    System.out.println(string);
  }
  
  static void print(String string)
  {
    System.out.print(string);
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    Student[] students = new Student[5];
    int choice;
    do
    {
      println("\nEnter 1 to input new student");
      if(Student.numberOfStudents > 0)
      {
        for(int i = 0; i < Student.numberOfStudents; i++)
          println("Enter " + (i + 2) + " to call " + students[i].name);
      }
      println("Enter 0 to terminate\n");
      print("Enter your choice: ");
      choice = in.nextInt();
      
      if(choice == 1)
      {
        if(Student.numberOfStudents < 5)
        {
          print("\nName: ");
          String name = in.next();
          print("Roll: ");
          int roll = in.nextInt();
        
          students[Student.numberOfStudents] = new Student(name, roll);
          println("\nInput Successful!");
        }
        else System.err.println("\nMemory Full! No More Inputs Allowed!");
      }
      else if(choice >= 2 && choice <= Student.numberOfStudents + 1)
      {
        students[choice - 2].sayName();
      }
      else if(choice == 0) break;
      else  System.err.println("\nWrong choice, try again...");
      
    }while(choice != 0);
    
    System.err.print("\nProgram Terminated.");
    in.close();
  }

}
