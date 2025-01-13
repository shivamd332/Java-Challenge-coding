import java.util.Scanner;

public class thirdPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the row for pattern: ");
    int num = sc.nextInt();
    printPattern(num);
    sc.close();
  }

  public static void printPattern(int num){
      for (int i = 0; i < num; i++) {
        for (int j = 0; j <  num-i-1; j++) {
          System.out.print("  ");
        }
        for(int k=0; k<=i; k++){
          System.out.print("* ");
        }
        System.out.println();
      }
  }
}
