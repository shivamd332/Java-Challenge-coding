import java.util.*;
public class checkPrime {
  public static void main(String[] args) {
    int count = 0;
    System.out.print("enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <=  n; i++){
      if (n%i == 0){
        count ++;
      }
    }
    if (count == 2){
      System.out.println("it is prime");
    }
    else {
      System.out.println("it is not prime");
    }
    sc.close();
  }
}