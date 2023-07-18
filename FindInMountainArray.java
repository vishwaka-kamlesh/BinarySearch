class FindInMountainArray {
    
    // Method to find the peak element in the mountain array
    static int findPeak(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int mid;
        
        // Loop until the start and end indices converge
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1])
                end = mid; // Peak is in the left half
            else if (nums[mid] < nums[mid + 1])
                start = mid + 1; // Peak is in the right half
                
            if (start == end) {
                return start; // Peak element found
            }
        }
        
        return -1; // Peak element not found
    }
    
    // Method to perform binary search in the ascending order part of the array
    static int searchAscending(int[] nums, int peak, int target) {
        int start = 0;
        int end = peak;
        int mid;
        
        // Loop until the start and end indices converge
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                return mid; // Target found
        }
        
        return -1; // Target not found
    }
    
    // Method to perform binary search in the descending order part of the array
    static int searchDescending(int[] nums, int peak, int target) {
        int start = peak + 1;
        int end = nums.length;
        int mid;
        
        // Loop until the start and end indices converge
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] > target)
                start = mid + 1;
            else if (nums[mid] < target)
                end = mid - 1;
            else
                return mid; // Target found
        }
        
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = { 10, 11, 12, 13, 14, 9, 8, 7, 6 };
        int target = 11;
        int peak = findPeak(nums);
        int result = searchAscending(nums, peak, target);
        
        if (result != -1)
            System.out.println("Element found at " + result);
        else {
            result = searchDescending(nums, peak, target);
            if (result != -1)
                System.out.println("Element found at " + result);
            else
                System.out.println("Element not found");
        }
    }
}
