class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int i =0, j=0, k = n-1;
        int[] arr = new int[n];

        while(i < n){
            if(nums[i] %2 == 0){
                arr[j] = nums[i];
                j++;
            }else{
                arr[k] = nums[i];
                k--;
            }

            // if(nums[i] %2 == 1 ){
            //     arr[k] = nums[i];
            //     k--;
            // }
            i++;
        }

        return arr;

    }
}