import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first no of LCM: ");
    int first = sc.nextInt();
    System.out.print("enter the second no of LCM: ");
    int second = sc.nextInt();
    int res =lcm(first, second);
    System.out.println("the lcm is: " + res);
    sc.close();
  }

  public static int lcm(int first, int second){
    for (int i=1; i <= first; i++){
      int mul = first * i;
      if (mul % second == 0){
        return mul;
      }
    }
    return 0;
  }
}
