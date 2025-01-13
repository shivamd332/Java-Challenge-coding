import java.util.Scanner;

public class arrayUtility {
  public static int[] inputArray(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int[] nums = new int[size];
    for(int i=0; i < size; i++){
      System.out.print("Enter element no "+(i+1)+" : " );
      nums[i] = sc.nextInt();
    }
    return nums;
  }



  public static int[] [] input2DArray(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = sc.nextInt();
    int[] [] numArray = new int[rows] [columns];

    for (int i=0; i<rows; i++){
      for (int j=0; j<columns; j++){
        System.out.print("Enter element Row: "+(i+1)+", column: "+(j+1)+" : ");
        numArray[i][j] = sc.nextInt();
      }
    }
    return numArray;
  }



  public static void displayArray(int[] numArray){
    for(int i=0; i<numArray.length; i++){
      System.out.print(numArray[i]+" ");
    }
    System.out.println();
  }
}
