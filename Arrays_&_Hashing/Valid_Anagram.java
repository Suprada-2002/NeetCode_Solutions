class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map= new HashMap<>();

        // enter all characters into map
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Character c: t.toCharArray()){
            if(!map.containsKey(c)) return false;
            // get count of key
            if(map.get(c) == 1) map.remove(c);
            else{
                map.put(c, map.get(c) - 1);
            }
        }

        if(map.isEmpty()) return true;
        return false;

    }
}
