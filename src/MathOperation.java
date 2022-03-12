import java.util.Scanner;

public class MathOperation {
  public static void main(String[] args)
  {
    System.out.println();


//
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number to multiply");
    int multiplier = scan.nextInt();

    System.out.println("Enter second number to multiply");
    int multiplicand = scan.nextInt();

    int count = multiplier;
    int result = 0;
    for(int x = 0;x < multiplicand; x++)
    {

      result = result + count;

    }

    System.out.println("Multiplication of " + multiplier + " * " + multiplicand + " = " +result);

  }
}


