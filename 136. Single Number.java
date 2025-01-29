136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
       for(int num:nums){
            ans ^=num;
        }
        return ans;
    }
}

217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     int n= nums.length;
    //   for(int i=0;i<n;i++){
    //     for(int j=1;j<n;j++){
    //         if(nums[i]==nums[j]){
    //             return true;
    //         }
    //     }
        
    //   }
    //   return false;

    HashSet<Integer> set = new HashSet<>();
    for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
    }
}


217. Contains Duplicate -II

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
      HashMap<Integer, Integer> map = new HashMap<>(); // To store element and its index
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // If the element exists and the difference of indices is <= k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the map with the current index
            map.put(nums[i], i);
        }
        
        return false; // No such pair found
    }

    }
