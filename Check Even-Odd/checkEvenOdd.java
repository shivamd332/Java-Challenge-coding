import java.util.Scanner;

public class checkEvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no for check even or odd: ");
    int num = sc.nextInt();
    if(num % 2 == 0) System.out.println("even");
    else System.out.println("odd");
    sc.close();
  }
}
