import java.util.Scanner;

public class secondPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no of rows: ");
    int num = sc.nextInt();
    printPattern(num);
    sc.close();
  }

  public static void printPattern(int num){
    for(int i = 0; num > i; num--){
      //System.out.print("*");
      for(int j =0;  j<num; j++  ){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
