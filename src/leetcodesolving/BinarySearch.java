public class BinarySearch {
    public static void main(String[] args) {
       int[] nums = {-1, 0, 3, 5, 90, 12};
        //int [] nums ={};
        //int [] nums = {1};
        System.out.println(search(nums, 9));
    }



    static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < nums[mid]) {
                end = mid - 1;
            }
            else  if (target > nums[mid]) {
                start = mid + 1;

            } else{
                return mid;
            }
        }
        return -1;
    }
}
