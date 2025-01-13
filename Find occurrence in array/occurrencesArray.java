import java.util.Scanner;

public class occurrencesArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numArr = arrayUtility.inputArray();
    System.out.print("enter no to find in array: ");
    int num = sc.nextInt();
    int occurrences = noOfOccurrences(numArr, num);
    System.out.println("your element found "+occurrences+" times in the array");
    sc.close();
  }

  public static int noOfOccurrences(int[] numArr, int num){
    int occ =0;
    for(int i=0; i< numArr.length; i++){
      if(numArr[i] == num){
        occ++;
      }
    }
    return occ;
  }
}
