class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        int count = 0;

        // Copy heights into arr
        for (int i = 0; i < n; i++) {
            arr[i] = heights[i];
        }

        // Manually sort arr using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Compare sorted array with original array
        for (int i = 0; i < n; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}