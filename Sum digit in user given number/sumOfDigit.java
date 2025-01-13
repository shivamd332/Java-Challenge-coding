import java.util.Scanner;

public class sumOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no for sum: ");
    int num = sc.nextInt();
    int res = addInteger(num);
    System.out.println("the sum of digit is: " +res);
    sc.close();
  }

  public static int addInteger(int num){
    int sum = 0;
    while (num > 0){
      sum += (num%10);
      num /= 10;
    }
    return sum;
  }
}
