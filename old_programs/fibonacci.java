import java.util.*;

class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0, b = 1, c = 1, d, i, n;
    System.out.println("Enter Limit");
    n = sc.nextInt();
    int f[] = new int[n];
    f[0] = a;
    f[1] = b;
    f[2] = c;
    for (i = 3; i < n; i++) {
      d = a + b + c;
      f[i] = d;
      a = b;
      b = c;
      c = d;
    }
    System.out.println("Fibonacci in Reverse");
    for (i = n - 1; i >= 0; i--) System.out.print(f[i] + " ");
    sc.close();
  }
}
/*
Output:
Enter Limit
15
Fibonacci in Reverse
377 233 144 89 55 34 21 13 8 5 3 2 1 1 0
*/
