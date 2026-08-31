class Solution {
    public void duplicateZeros(int[] arr) {
        int possZero = 0;
        int lstidx = arr.length - 1;

        // Count zeros that can be duplicated
        for (int i = 0; i <= lstidx - possZero; i++) {
            if (arr[i] == 0) {

                // Edge case: zero can only be placed once
                if (i == lstidx - possZero) {
                    arr[lstidx] = 0;
                    lstidx--;
                    break;
                }

                possZero++;
            }
        }

        int newLastIdx = lstidx - possZero;

        // Shift elements from right to left
        for (int i = newLastIdx; i >= 0; i--) {

            if (arr[i] == 0) {
                arr[i + possZero] = 0;
                possZero--;
                arr[i + possZero] = 0;
            } else {
                arr[i + possZero] = arr[i];
            }
        }
    }
}