import java.util.Scanner;

public class compoundInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a principle amount: ");
    int p = sc.nextInt();
    System.out.println("enter a rate: ");
    float r = sc.nextFloat();
    System.out.println("enter a time in years: ");
    float t = sc.nextFloat();

    double CI = p * Math.pow((1 + r / 100), t);
    System.out.println("your compound intrest is : " + CI);
    sc.close();
  }
}
