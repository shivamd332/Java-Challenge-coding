import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no for table: ");
    int num = sc.nextInt();
    printTable(num);
    sc.close();
  }
  public static void printTable(int num) {
    for (int i = 1; i <= 10; i++){
      int mul = num * i;
      System.out.println(num + " X " + i + " = " + mul);
    }
  }
}
