import java.util.Scanner;

/**
 * determine weather user input is odd or even
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    System.out.println("Please enter an integer:");
    int num = input.nextInt();

    //gets remainder from user number
    int remain = num % 2;

    //determines if number is odd or even
    if (remain == 0) {
      System.out.println(num + " is an even number");
    }else {
      System.out.println(num + " is an odd number");
    }
    
  }
}
