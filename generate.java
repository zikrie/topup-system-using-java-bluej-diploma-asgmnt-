import java.util.*;
 
public class generate
 {
  public static void main(String[] args)
  {
    int c;
    Random t = new Random();
 
    for (c = 1; c <= 4; c++) 
    {
      System.out.print(t.nextInt(9));
    }
    System.out.print(" ");
    for (c = 1; c <= 4; c++) 
    {
      System.out.print(t.nextInt(9));
    }
    System.out.print(" ");
    for (c = 1; c <= 4; c++) 
    {
      System.out.print(t.nextInt(9));
    }
    System.out.print(" ");
    for (c = 1; c <= 4; c++) 
    {
      System.out.print(t.nextInt(9));
    }
  }
}

