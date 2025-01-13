public class isSortedArray {
  public static void main(String[] args) {
    int[] numArr = arrayUtility.inputArray();
    boolean isInc = isIncrease(numArr);
    boolean isDec = isDecrease(numArr);
    if(isInc || isDec){
      System.out.println("your array is sorted");
    }
    else System.out.println("your array is not sorted");
  }

  public static boolean isIncrease(int[] numArr){
    for(int i=1; i < numArr.length; i++){
      if(numArr[i]<numArr[i-1]){
        return false;
      }
    }
    return true;
  }

  public static boolean isDecrease(int[] numArr){
    for(int i=1; i<numArr.length; i++){
      if(numArr[i]>numArr[i-1]) {
        return false;
      }
    }
    return true;
  }
}
