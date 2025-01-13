import java.util.Scanner;

public class search2DArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] [] numArray = arrayUtility.input2DArray();
    System.out.println("Enter the number you want to search: ");
    int num = sc.nextInt();
    boolean isFound = search(numArray,  num);

    if(isFound){
      System.out.println("Your number was found");
    }
    else{
      System.out.println("Your number was not found");
    }
    sc.close();
  }

  
  public static boolean search(int[] [] numArray, int num){
    for (int i=0; i< numArray.length; i++){
      for (int j=0; j<numArray[i].length;j++){
        if (numArray [i][j] == num){
          return true;
        }
      }
    }
    return false;
  }
}
