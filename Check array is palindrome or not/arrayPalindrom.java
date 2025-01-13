public class arrayPalindrom {
  public static void main(String[] args) {
    int[] numArr = arrayUtility.inputArray();
    boolean isPalin = isPalindromeArray(numArr);
    if(isPalin){
      System.out.println("The array is Palindrome");
    }
    else{
      System.out.println("The array is not Palindrome");
    }
  }

  public static boolean isPalindromeArray(int[] numArr){
    for(int i=0; i<numArr.length; i++){
      if(numArr[i] != numArr[numArr.length-1-i]){
        return false;
      }
    }
    return true;
  }
}
