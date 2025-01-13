public class maxMinArray {
  public static void main(String[] args) {
    int[] numArr = arrayUtility.inputArray();
    int max = max(numArr);
    int min = min(numArr);
    System.out.println("max of  the array is: "+max);
    System.out.println("min of the array is: "+min);
  }

  public static int max(int[] numArr){
    if(numArr.length == 0){
      return Integer.MIN_VALUE;
    }
    int max = numArr[0];
    for(int i=1; i <numArr.length; i++){
      if(max < numArr[i]){
        max = numArr[i];
      }
    }
    return max;
  }

  public static int min(int[] numArr){
    int min = Integer.MAX_VALUE;
    for(int i=0; i<numArr.length;i++){
      if(min>numArr[i]) {
        min = numArr[i];
      }
    }
    return min;
  }
}
