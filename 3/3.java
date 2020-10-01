class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int tracker = 0;
        int pos = 0;
        HashMap<Character, Integer> _c = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++)
            {   
                if (_c.containsKey(s.charAt(i))) {
                    pos = _c.get(s.charAt(i));
                    if(pos > tracker) 
                        { 
                        tracker = pos;
                        }
                    }
                
                if((i - tracker + 1) > count)
                    {
                    count = (i - tracker + 1);
                    }
                   
                _c.put(s.charAt(i), i + 1);
            }
        
        return count;
    }
}
