package QuestionsSolving;
//Input: nums = [1,3,5,6], target = 5
//Output: 2

//Input: nums = [1,3,5,6], target = 2
//Output: 1

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6}; //target = 5
        System.out.println(searchInsert(nums, 4));
    }


    static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        if(target < nums[0]){
            return 0;
        }


        while (start <= end) {
            int mid = start + (end - start) / 2;
            for (int i = 0; i < end; i++) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return start;
    }
}

