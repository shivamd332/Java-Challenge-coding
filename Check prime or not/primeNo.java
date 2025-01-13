import java.util.Scanner;

public class primeNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a no for prime or not: ");
    int num = sc.nextInt();
    boolean isPrime = checkPrime(num);
    if(isPrime){
      System.out.println("prime");
    } else{
      System.out.println("not prime");
    }
    sc.close();
  }

  public static boolean checkPrime(int num){
    //int count=0;
    for(int i =2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
     return true;
  }
}
