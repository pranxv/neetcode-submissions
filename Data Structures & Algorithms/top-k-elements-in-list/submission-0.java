class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        System.out.println(frequencyMap);

        List<Integer> [] counts = new List[nums.length+1];

        for(int key: frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(counts[frequency] == null)counts[frequency] = new ArrayList<>();
            counts[frequency].add(key);
        }

        int [] result = new int[k];
        int idx = 0;
        for(int i = counts.length-1; i > 0 && idx < k; i--){
            if(counts[i] != null){
                for(int num: counts[i]){
                    if(idx == k)break;
                    result[idx++] = num;
                }
            }
        }
        return result;
    }
}
