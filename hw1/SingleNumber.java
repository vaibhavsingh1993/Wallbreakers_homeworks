class Solution {
    //     public int singleNumber(int[] nums) {
    //         Set<Integer> set = new HashSet();
            
    //         for (int num : nums) {
    //             if (set.contains(num)) set.remove(num);
    //             else set.add(num);
    //         }
    //         return new ArrayList<Integer>(set).get(0);
    //     }
        
        
        // Run xor with all numbers
        public int singleNumber(int[] nums) {
            int ans = 0;
            for (int num : nums) {
                ans ^= num;
            }
            return ans;
        }
    }