import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no for check armstrong or not: ");
    int num = sc.nextInt();
    boolean isArmstrong = isArmstrong(num);
    if(isArmstrong){
      System.out.println("Your number is Armstrong");
    }
    else{
      System.out.println("It is not Armstrong");
    }
    sc.close();
  }

  public static boolean isArmstrong(int num){
    int numCopy = num;
    int noOfDigit = noOfDigit(num);
    int finalNumber = 0;
    while (num>0){
      int lastDigit = num%10;
      num/= 10;
      finalNumber += pow(lastDigit, noOfDigit);
    }
    return finalNumber==numCopy;
  }

  public static int pow(int num1, int num2){
    int result= 1;
    for(int i =0; i<num2; i++){
      result *=num1;
    }
    return result;
  }

  public static int noOfDigit(int num){
    int digit =0;
    while (num>0){
      digit++;
      num/=10;
    }
    return digit;
  }
}
