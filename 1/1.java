class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> box = new HashMap<Integer, Integer>();
        for(int _index = 0 ; _index < nums.length; _index++ )
        {
            
            
            if(box.size() >= 1)
                {
                       if(box.containsKey(target - nums[_index]))
                       {
                            return new int[] {box.get(target - nums[_index]), _index} ; 
                       }
                        
                }
            box.put(nums[_index], _index);
            
        }
        
        return new int[] { 0, 0 };
    }
}
