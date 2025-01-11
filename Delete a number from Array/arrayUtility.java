import java.util.Scanner;

public class arrayUtility {
  public static int[] inputArray(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    int[] nums = new int[size];
    sc.close();
    for(int i=0; i < size; i++){
      System.out.print("Enter element no "+(i+1)+" : " );
      nums[i] = sc.nextInt();
    }
    return nums;
  }

  public static void displayArray(int[] numArray){
    for(int i=0; i<numArray.length; i++){
      System.out.print(numArray[i]+" ");
    }
    System.out.println();
  }
}
