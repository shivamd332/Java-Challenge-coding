public class diagonalSum2DArray {
  public static void main(String[] args) {
    int[] [] numArray = arrayUtility.input2DArray();
    long sum = sumOfDiagonal(numArray);
    System.out.println("Sum of Diagonal is: "+sum);
  }

  public static long sumOfDiagonal(int[][] numArray){
    long leftSum = sumOfLeftDiagonal(numArray);
    long rightSum = sumOfRightDiagonal(numArray);
    long sum = leftSum+rightSum;
    if(numArray.length %2 !=0){
      int ind = numArray.length/2;
      sum -= numArray[ind][ind];
    }
    return sum;
  }

  public static long sumOfLeftDiagonal(int[][] numArray){
    long sum=0;
    for (int i=0; i<numArray.length; i++){
      sum += numArray[i][i];
    }
    return sum;
  }

  public static long sumOfRightDiagonal(int[][] numArray){
    long sum =0;
    for (int i=0; i< numArray.length; i++){
      int col = numArray.length-1-i;
      sum += numArray[i][col];
    }
    return sum;
  }
}
