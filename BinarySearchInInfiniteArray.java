class BinarySearchInInfiniteArray {
    
    // Method to find the indices in an infinite array
    static int indices(int[] nums, int target) {
        int start = 0;
        int end = 1;
       
        // Expand the range exponentially until the target element is within the range
        while (nums[end] < target) {
            int temp = start;
            start = end + 1;
            end = end + (end - temp + 1) * 2;
        }
        
        // Perform binary search within the identified range
        return binarySearch(nums, start, end, target);
    }
    
    // Binary search method to find the target element in the given range
    static int binarySearch(int[] nums, int start, int end, int target) {
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                return mid; // Target found
            }
        }
        
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 3;
        int result = indices(nums, target);
        if (result != -1)
            System.out.println("Element found at position: " + result);
        else
            System.out.println("Element not found");
    }
}
