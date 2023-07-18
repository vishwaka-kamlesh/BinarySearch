class FirstAndLastOccurence {
    static int binarySearch(int[] nums, int target, boolean firstOccurrence) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int result = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                result = mid;
                if (firstOccurrence)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 7 };
        int target = 3;
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);

        System.out.println("first: " + first + " last: " + last);
    }
}
