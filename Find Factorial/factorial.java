import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number for factorial: ");
    int num = sc.nextInt();
    long res = fact(num);
    System.out.println("The factorial is: " + res);
    sc.close();
  }

  public static long fact( int num){
    if (num < 2){
      return 1;
    }
    else {
      int mul = 1;
      for(int i =2; i <= num; i++){
        mul *= i;
      }
      return mul;
    }
  }
}
