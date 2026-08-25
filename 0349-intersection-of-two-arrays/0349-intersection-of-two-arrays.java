class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> S1 = new HashSet<>();
        Set<Integer> S2 = new HashSet<>();

        for(int num : nums1){
            S1.add(num);
        }

        for(int num : nums2){
            S2.add(num);
        }

        if(S1.size() < S2.size()){
            int[] result = new int[S1.size()];
                int k = 0;

                for(int num : S1){
                    if(S2.contains(num)){
                        result[k] = num;
                        k++;
                    }
                }
            return Arrays.copyOfRange(result, 0, k );

        }else{
            int[] result = new int[S2.size()];
                int k = 0;

                for(int num : S2){
                    if(S1.contains(num)){
                        result[k] = num;
                        k++;
                    }
                }
            return Arrays.copyOfRange(result, 0, k );

        }
    }
}