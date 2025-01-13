import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first no of  GCD: ");
    int first = sc.nextInt();
    System.out.print("enter the second no of GCD: ");
    int second = sc.nextInt();
    int res = gcd(first, second);
    System.out.println("the gcd is: " + res);
    sc.close();
  }

  public static int gcd(int first, int second){
    int gcd =1;
    int least = least( first, second);
    for(int i =2; i <=least; i++){
      if(first %i ==0 && second % i ==0){
        gcd = i;
      }
    }
    return gcd;
  }

  public static int least(int num1, int num2){
    if(num1 < num2){
      return num1;
    } else{
      return num2;
    }
  }
}
