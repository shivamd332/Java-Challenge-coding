import java.util.Scanner;

public class greatestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a first no. : ");
    int num1 = sc.nextInt();
    System.out.println("enter a second no. : ");
    int num2 = sc.nextInt();
    System.out.println("enter a third no. : ");
    int num3 = sc.nextInt();

    if(num1 >= num2 && num1 >= num3 ) {
      System.out.println("the greatest no is: " + num1);
      }
    else if (num2 >= num3) {
      System.out.println("the greatest no is: "+num2);
    }
    else System.out.println("the greatest no is: "+num3);
    sc.close();
  }
}
