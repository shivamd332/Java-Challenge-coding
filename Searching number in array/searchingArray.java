import java.util.Scanner;

public class searchingArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int []arr = {2, 3, 5, 7, 11, 17, 25, 47, 39, 50, 62, 78, 83, 95};
    System.out.print("enter no for search in array: ");
    int num = sc.nextInt();
    boolean isFound = isFound(arr, num);
    if(isFound) {
      System.out.println("number is found");
    }
    else{
      System.out.println("number is not found");
    }
  }

  public static boolean isFound(int[] arr, int num){
    int index = 0;
    while (index <  arr.length){
      if(arr[index] == num){
        return true;
      }
      index++;
    }
    return false;
  }
}
