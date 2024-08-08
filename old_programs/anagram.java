import java.util.*;
class anagram
{
static String sort(String s)
{
  String t="";
  for(char i='A';i<='Z';i++)
  {
    for(int j=0;j<s.length();j++)
    {
      if(i==s.charAt(j))
      t=t+i;
    }
  }
  return t;
}
public static void main (String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
System.out.println("Enter the first word:");
a=in.next();
a=a.toUpperCase();
System.out.println("Enter the second word:");
b=in.next();
b=b.toUpperCase();

if(sort(a).equals(sort(b)))
System.out.println("Anagram");
else
System.out.println("Not Anagram");
in.close();
}
}