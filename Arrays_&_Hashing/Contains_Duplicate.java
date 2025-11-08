// time complezity: O(log n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;

        HashSet<Integer> map = new HashSet<>();

        for(int i: nums){
            if(map.contains(i)) return true;
            map.add(i);
        }
        return false;
        
    }
}
