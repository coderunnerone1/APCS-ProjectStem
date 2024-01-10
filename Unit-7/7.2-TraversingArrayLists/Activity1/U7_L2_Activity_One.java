import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    ArrayList<String> words = new ArrayList<String>();
    String input = "";
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!(input.equals("STOP")))
    {
      input = scan.nextLine();
      if (!(input.equals("STOP")))
        words.add(input);
    }
    
    System.out.println(words);
    for (int i = 0; i < words.size(); i++)
    {
      System.out.println(words.get((words.size() - 1) - i) + words.get(i));
    }
  }
}
