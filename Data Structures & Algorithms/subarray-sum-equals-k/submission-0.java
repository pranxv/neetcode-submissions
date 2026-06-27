class Solution {
    public int subarraySum(int[] nums, int k) {
        int counts = 0;
        HashMap<Integer, Integer> values = new HashMap<>();
        int[] prefix = new int[nums.length+1];
        prefix[0] = 0;
        values.put(0,1);

        for(int i =1 ; i <= nums.length; i++){
            prefix[i] = prefix[i-1]+ nums[i-1];
            int result = prefix[i] - k;
            if(values.containsKey(result)){
                counts += values.get(result);
            }
            values.put(prefix[i], values.getOrDefault(prefix[i],0)+1);
        }

        return counts;
}
}