package myjava;

class BoxPatt
{
public static void main(String[] args)
{
int i,j,k,x=4,y=1;
for(i=1;i<=12;i++)
{
 if(i<10)
 {
   for(j=1;j<=x;j++)
   System.out.print("  ");
   for(k=1;k<=y;k++)
   System.out.print("*   ");
   System.out.println();
   if(i%3==0)
   {
    x++;
    y--;
   }
   else
   {
    x--;
    y++;
   }
 }
 else
 {
   System.out.println("      |   |");
 }
}
}
}