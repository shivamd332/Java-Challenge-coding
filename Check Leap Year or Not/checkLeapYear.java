import java.util.Scanner;

public class checkLeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a year for check leap year or not: ");
    int year = sc.nextInt();

    if(year % 400 == 0 || (year %4 ==0 && year % 100 != 0)){
      System.out.println("it is leap year");
    }
    else {
      System.out.println("not leap year");
    }
    sc.close();
  }
}
