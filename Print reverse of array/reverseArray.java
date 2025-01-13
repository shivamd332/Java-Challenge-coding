public class reverseArray {
  public static void main(String[] args) {
    int[] numArr = arrayUtility.inputArray();
    reverse(numArr);
    System.out.print("here the reverse array is: ");
    arrayUtility.displayArray(numArr);
  }

  public static void reverse(int[] numArr){
    for (int i=0; i<numArr.length/2; i++){
      int swap = numArr[i];
      numArr[i] = numArr[(numArr.length-1)-i];
      numArr[(numArr.length-1)-i] = swap;
    }
  }
}
