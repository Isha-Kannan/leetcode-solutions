class Solution {
    public boolean canJump(int[] nums) {
        //test
      int lp = nums.length-1;

      for(int i=nums.length-2;i>=0;i--){
        if(i+nums[i]>=lp){
            lp = i;
        }

      }

      return lp == 0;
    }
}