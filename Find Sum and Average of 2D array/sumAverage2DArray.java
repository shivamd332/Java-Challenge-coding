public class sumAverage2DArray {
  public static void main(String[] args) {
    int[] [] numArr = arrayUtility.input2DArray();
    long sum = sum(numArr);
    double avg = average(numArr);
    System.out.println("The sum of  array is: "+sum);
    System.out.println("The average of array is: "+avg);
  }

  public static long sum(int[][] numArr){
    long sum=0;
    for (int i=0; i<numArr.length; i++){
      for (int j=0; j<numArr.length; j++){
        sum += numArr[i][j];
      }
    }
    return sum;
  }

  public static double average(int[][] numArr){
    int row = numArr.length;
    int cols = numArr[0].length;
    double size = row*cols;
    return sum(numArr)/size;
  }
}
