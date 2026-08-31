class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];

        for(int i = 0; i<n; i++){
            array[i] = nums[i] * nums[i];
        }

        Arrays.sort(array);

        return array;
    }
}