import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no for fibonacci series: ");
    int num = sc.nextInt();
    System.out.print("the fibonacci series is: ");
    printFibonacci(num);
    sc.close();
  }

  public static void printFibonacci(int num){
    if(num < 0) return;
    System.out.print("0 ");
    if(num == 0) return;
    System.out.print("1 ");

    int first =0, second = 1;
    while(first + second <= num){
      int third = first+second;
      System.out.print(third+" ");
      first=second;
      second = third;
    }
  }
}
