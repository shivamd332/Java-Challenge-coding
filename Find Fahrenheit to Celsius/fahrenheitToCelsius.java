import java.util.Scanner;

public class fahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the fahrenheit value: ");
    float f = sc.nextFloat();
    float c = (f - 32) * 5.0f / 9.0f; 
    System.out.println("the celsius is : " + c);
    sc.close();
  }
}
