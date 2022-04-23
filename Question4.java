import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Your base size in integer: "); int sz = in.nextInt();
    for (int i=0;
      i<sz;
      i++)
    {
      for (int j=i;
        j<sz;
        j++)
      {
        System.out.print("*");
      }
      if (i!=(sz-1)) System.out.println();
    }
  }
}
