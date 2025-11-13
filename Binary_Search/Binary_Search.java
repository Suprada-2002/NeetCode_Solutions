// Only works on Sorted Arrays
// Time Complexity - O(log n)

text
  textx
  textxt
class Binary_Search  {

  public static int seach(int[] arr, int target)  {
    int first = 0, last = arr.length-1, mid=0;

    while(first<=last){
       mid = (first+last)/2;
       if(arr[mid] == target) return mid;
       else if(arr[mid] > target) last--;
       else left++;
    }
    return -1;
  }
  
  public static void main() {
    int[] arr = {};
    Arrays.sorted(arr);
      System.out.println(search(arr, target));
  }
}
