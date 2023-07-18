class LetterCeiling {
    
    // Binary search method to find the target element in the array
    static int binarySearch(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Loop until the start and end indices converge
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;
            
            // Compare the target with the element at the middle index
            if (letters[mid] <= target)
                start = mid + 1; // Target is in the upper half
            else if (letters[mid] > target)
                end = mid - 1; // Target is in the lower half
        }
        
        return start; // Target not found, return the index of the ceiling
    }
    
    public static void main(String[] args) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e' };
        char target = 'a';
        
        int result = binarySearch(letters, target);
        if (result != -1)
            System.out.println(result); // Print the index of the found element
        else
            System.out.println("Element not found");
    }
}
