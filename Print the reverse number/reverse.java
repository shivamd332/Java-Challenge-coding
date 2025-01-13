import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no for reverse: ");
    int num = sc.nextInt();
    int res = rev(num);
    System.out.println("the reverse no is: "+res);
    sc.close();
  }

  public static int rev(int num){
    int newNum = 0;
    while (num > 0){
      int digit = num%10;
      newNum = newNum*10 +digit;
      num /= 10;
    }
    return newNum;
  }
}
