import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int count = 0, temp = 0, index = 0;
    ArrayList<Integer> intList = new ArrayList<Integer>(), countList = new ArrayList<Integer>();
    System.out.print("Number of integers to be entered (in integer): "); count = in.nextInt();
    for (int i=0;
      i<count;
      i++)
    {
      System.out.print("Integer: "); temp = in.nextInt();
      for (int j=0;
        j<intList.size();
        j++)
      {
        if (temp == intList.get(j))
        {
          countList.set(j, countList.get(j)+1);
          continue;
        }
      }
      intList.add(temp); countList.add(1);
    }
    temp = Integer.MIN_VALUE;
    for (int i=0;
      i<intList.size();
      i++)
    {
      if (temp < countList.get(i))
      {
        temp = countList.get(i);
        index = i;
      }
    }
    System.out.print("The most occurance integer inputed is: "); System.out.println(intList.get(index));
  }
}
