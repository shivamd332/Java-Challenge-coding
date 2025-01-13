import java.util.Scanner;

public class simpleInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a principle amount: ");
    int p = sc.nextInt();
    System.out.println("enter a rate: ");
    float r = sc.nextFloat();
    System.out.println("enter a time in years: ");
    float t = sc.nextFloat();

    float SI = (p * r * t ) / 100;
    System.out.println("the simple interest is: "+SI);
    sc.close();
  }
}
