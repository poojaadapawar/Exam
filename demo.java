public class LinearSearch {
  public static int search(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
    int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};
    int target = 34;
    int result = search(array, target);
    if (result == -1) {
      System.out.println("Element is not present in array");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }
