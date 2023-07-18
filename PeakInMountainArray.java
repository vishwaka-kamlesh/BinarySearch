class PeakInMountainArray {
    
    // Binary search method to find the peak element in the mountain array
    static int binarySearch(int[] nums) {
        
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

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 5, 4, 3, 2, 1 };
        int result = binarySearch(nums);
        if (result != -1)
            System.out.println("Element found at position: " + result);
        else
            System.out.println("Element not found");
    }
}
