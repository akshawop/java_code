package myjava.oop.test;

public class Human
{
  String name;
  int age;
  boolean isAlive;
  
  Human(String n, int a, boolean isAlive)
  {
    name = n;
    age = a;
    this.isAlive = isAlive;
  }
  
  void eat()
  {
    System.out.println(name.substring(0, name.indexOf(" ")) + " is eating");
  }
  
  void walk()
  {
    System.out.println(name.substring(0, name.indexOf(" ")) + " is walking");
  }
}
