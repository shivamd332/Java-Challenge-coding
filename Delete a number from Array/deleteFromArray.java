import java.util.Scanner;

public class deleteFromArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numArr = arrayUtility.inputArray();
    System.out.print("Enter the no for delete from array: ");
    int numToDelete = sc.nextInt();
    System.out.println();
    int[] newArr = deleteNumber(numArr, numToDelete);
    System.out.print("Here is your new array: ");
    arrayUtility.displayArray(newArr);
    System.out.println();
    sc.close();
  }

  public static int[] deleteNumber(int[] numArr, int numToDelete){
    int occ = occurrencesArray.noOfOccurrences(numArr, numToDelete);
    if(occ == 0){
      return numArr;
    }
    int newSize = numArr.length-occ;
    int[] newArr = new int[newSize];
    int index = 0;
    for(int num : numArr){
      if(num != numToDelete){
        newArr[index++] = num;
      }
    }

    return newArr;
  }
}
