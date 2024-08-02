package myjava.oop.test;

import java.util.*;
public class DiceRoll
{
  Random random;
  int number;
  DiceRoll()
  {
    random = new Random();
  }
  
  void roll()
  {
    number = random.nextInt(6) + 1;
    System.out.println(number);
  }
  
  public static void main(String[] args)
  {
    DiceRoll dice = new DiceRoll();
    
    dice.roll();
  }
}