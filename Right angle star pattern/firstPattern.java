import java.util.Scanner;

public class firstPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no for rows: ");
    int num = sc.nextInt();
    printPattern(num);
    sc.close();
  }

  public static void printPattern(int num){
    for(int i=0; i < num; i++){
      System.out.print("*");
      for(int j =0; j < i; j++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
