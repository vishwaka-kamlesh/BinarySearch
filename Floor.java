class Floor {
    
    // Binary search method to find the target element in the array
    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // Loop until the start and end indices converge
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;
            
            // Compare the target with the element at the middle index
            if (nums[mid] == target)
                return mid; // Target found at the middle index
            else if (nums[mid] < target)
                start = mid + 1; // Target is in the upper half
            else
                end = mid - 1; // Target is in the lower half
        }
        
        return end; // Target not found, return the index of the floor
    }
    
    public static void main(String[] args) {
        int[] nums = { 40, 50, 60, 70, 90, 100 };
        int target = 85;
        
        int result = binarySearch(nums, target);
        if (result != -1)
            System.out.println(result); // Print the index of the found element
        else
            System.out.println("Element not found");
    }
}
