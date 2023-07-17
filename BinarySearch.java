// Binary search in an array

class BinarySearch {
    
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
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return -1; // Target not found
    }
    
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 9, 10 };
        int target = 5;
        
        int result = binarySearch(nums, target);
        if (result != -1)
            System.out.println(result); // Print the index of the found element
        else
            System.out.println("Element not found");
    }
}
