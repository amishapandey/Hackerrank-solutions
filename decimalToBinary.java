import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    StringBuilder s = new StringBuilder("");
    int a, i;
    while (n > 0)
      {
	a = n % 2;
	s.append(a);
	n = n / 2;
      }
   s=s.reverse();
    System.out.print(s);
  }
}
