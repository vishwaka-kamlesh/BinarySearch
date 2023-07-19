import java.util.*;

class BinarySearchIn2DArray {
    public static void main(String[] args) {
        // Define a 2D array (matrix)
        int[][] matrix = {
            { 2, 4, 6, 8, 10},
            { 12, 14, 16, 18, 20},
            { 22, 24, 26, 28, 30}
        };
        
        int target = 26;
        System.out.println(Arrays.toString(search(matrix, target))); // Call the search function and print the result
    }
    
    // Binary search function for the 2D array
    static int[] search(int[][] matrix, int target) {
        int r = 0; // Initialize row pointer to the top row
        int c = matrix[0].length - 1; // Initialize column pointer to the rightmost column
        
        // Continue searching until we reach the bottom row or the leftmost column
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                // If the target is found, return the position [r, c]
                return new int[]{r, c};
            } else if (matrix[r][c] < target) {
                // If the current element is less than the target, move down to the next row
                r++;
            } else {
                // If the current element is greater than the target, move left to the previous column
                c--;
            }
        }
        
        // If the target is not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}
