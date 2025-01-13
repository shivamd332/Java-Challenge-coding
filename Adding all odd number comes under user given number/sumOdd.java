import java.util.Scanner;

public class sumOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a no for add total odd number: ");
    int num = sc.nextInt();
    sumTotalOdd(num);
    sc.close();
  }

  public static void sumTotalOdd(int num){
    int sum = 0;
    for (int i =1; i <= num; i+=2){
      sum = sum + i;
    }
    System.out.println("the total number is: "+ sum);
  }
}
