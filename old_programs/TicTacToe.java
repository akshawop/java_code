package myjava.java.myjava;
import java.util.*;
public class TicTacToe 
{
 public static void main(String[] args) 
 {
 Scanner in=new Scanner(System.in);
 int pa;
 do{
 System.err.println("WELCOME TO THE GAME OF TIC-TAC-TOE :-\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 System.out.print("Input the name of Player 1 [X]:~ ");
 String x=in.next();
 System.out.print("Input the name of Player 2 [O]:~ ");
 String o=in.next();
 char t[][]=new char[3][3];
 for(int i =0;i<3;i++)
 {
   for(int j=0;j<3;j++)
   t[i][j]=' ';
 }
 for(int i =0;i<3;i++)
 {
   for(int j=0;j<3;j++)
    System.out.print("["+t[i][j]+"]");
    System.out.println("\n");
 }
 int f=0,b=1;
 while(b<=9)
  { int r,c;
  if(b%2!=0)
  {
  do{
   System.err.println(x +"’s [X] turn :-");
   System.out.println("input row and column :-");
   r=in.nextInt();
   c=in.nextInt();
   }while(r>3 || c>3);
   if(t[r-1][c-1]!=' ')
   {
   System.err.println("Already filled !");
   for(int i=0;i<3;i++)
    {
     for(int j=0;j<3;j++)
      System.out.print("["+t[i][j]+"]");
      System.out.println("\n");
    }
   continue ;
   }
   t[r-1][c-1]='X';
   }
   else
  {
  do{
   System.err.println(o +"’s [O] turn :-");
   System.out.println("input row and column :-");
   r=in.nextInt();
   c=in.nextInt();
   }while(r>3 || c>3);
   if(t[r-1][c-1]!=' ')
   {
    System.err.println("Already filled !");
    for(int i=0;i<3;i++)
    {
     for(int j=0;j<3;j++)
      System.out.print("["+t[i][j]+"]");
      System.out.println("\n");
    }
    continue;
   }
   t[r-1][c-1]='O';
   }
   b++;
   for(int i=0;i<3;i++)
 {
   for(int j=0;j<3;j++)
    System.out.print("["+t[i][j]+"]");
    System.out.println("\n");
 }
 
 //checking...
 if((t[0][0]=='X' && t[0][1]=='X' && t[0][2]=='X') || (t[0][0]=='O' && t[0][1]=='O' && t[0][2]=='O'))
 {
  if(t[0][0]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[1][0]=='X' && t[1][1]=='X' && t[1][2]=='X') || (t[1][0]=='O' && t[1][1]=='O' && t[1][2]=='O'))
 {
  if(t[1][0]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[2][0]=='X' && t[2][1]=='X' && t[2][2]=='X') || (t[2][0]=='O' && t[2][1]=='O' && t[2][2]=='O'))
 {
  if(t[2][0]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[0][0]=='X' && t[1][0]=='X' && t[2][0]=='X') || (t[0][0]=='O' && t[1][0]=='O' && t[2][0]=='O'))
 {
  if(t[0][0]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[0][1]=='X' && t[1][1]=='X' && t[2][1]=='X') || (t[0][1]=='O' && t[1][1]=='O' && t[2][1]=='O'))
 {
  if(t[0][1]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[0][2]=='X' && t[1][2]=='X' && t[2][2]=='X') || (t[0][2]=='O' && t[1][2]=='O' && t[2][2]=='O'))
 {
  if(t[0][2]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[0][0]=='X' && t[1][1]=='X' && t[2][2]=='X') || (t[0][0]=='O' && t[1][1]=='O' && t[2][2]=='O'))
 {
  if(t[0][0]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 
 if((t[0][2]=='X' && t[1][1]=='X' && t[2][0]=='X') || (t[0][2]=='O' && t[1][1]=='O' && t[2][0]=='O'))
 {
  if(t[0][2]=='X')
  System.out.print(x+" [X] Wins!!!");
  else
  System.out.print(o+" [O] Wins!!!");
  f=1;
  break;
 }
 //checking ends here.
 }
 if(f==0)
 System.out.print("Draw!");
 System.err.println("\nTo Exit, enter 0(zero) :-");
 System.err.println("To Play Again, enter any number :-");
 pa=in.nextInt();
 }while(pa!=0);
 in.close();
 }
}