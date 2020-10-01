class Solution {
// Slower Solution , Better way to do this will be 3.java
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) { return 0;}
        if(s.length()==1) { return 1;}
        
        int count = 0;
        int _c = 0;
        HashMap<Character, Integer> _collection = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++)
            {   
                if(_collection.containsKey(s.charAt(i)))
                {
                    i = _collection.get(s.charAt(i));
                    _collection.clear();
                    _c = 0;
                }
                else
                {   
                    _c++;
                    _collection.put(s.charAt(i), i);
                }
               
                if(_c > count)  { count = _c; }
            }
        
        return count;
    }
}
