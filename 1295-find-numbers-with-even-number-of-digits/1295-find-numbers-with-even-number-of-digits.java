class Solution {
    // public boolean numberHasEvenDigits(int num){
    //     int digitCount = 0;

    //     while(num !=0){
    //         num = num/10;
    //         digitCount++;
    //     }

    //     return digitCount % 2 ==0;
    // }

    public int findNumbers(int[] nums) {
        int even = 0;

        for(int i = 0; i < nums.length; i++){
            int count = 0;

            while (nums[i] != 0){
                nums[i] = nums[i] /10;
                count++;
            }

            if(count % 2 == 0){
                even++;
            }
        }
        return even;
    }
}