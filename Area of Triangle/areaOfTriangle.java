import java.util.Scanner;

public class areaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a base: ");
    double b = sc.nextDouble();
    System.out.println("enter a height: ");
    double h = sc.nextDouble();
    //double area = 0.5 * b * h;
    double area = (b * h ) /2;
    System.out.println("area of triangle : " + area);
    sc.close();
  }
}
