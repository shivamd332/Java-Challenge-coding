public class sumAverageArray {
  public static void main(String[] args) {
    int[] numArray = arrayUtility.inputArray();
    long sum = sum(numArray);
    double avg = average(numArray);
    System.out.println("Sum of the array: "+sum);
    System.out.println("Average of the array is: "+avg);
  }

  public static long sum(int[] numArray){
    long sum =0;
    for(int i=0; i<numArray.length; i++){
      sum+=numArray[i];
    }
    return sum;
  }

  public static double average(int[] numArray){
    double sum = sum(numArray);
    return  (sum/numArray.length);
  }
}
