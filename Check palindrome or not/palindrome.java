import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no for check palindrome or not: ");
    int num = sc.nextInt();
    boolean isPalindrome = isPalindrome(num);
    if(isPalindrome){
      System.out.println("This is palindrome");
    }
    else{
      System.out.println("This is not palindrome");
    }
    sc.close();
  }


  public static boolean isPalindrome(int num){
    return num == reverse(num);
  }


  public static int reverse(int num){
    int newNum=0;
    while (num>0){
      int digit = num%10;
      newNum = newNum*10+digit;
      num/=10;
    }
    return newNum;
  }
}
