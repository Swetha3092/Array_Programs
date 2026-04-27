class Solution {
    public int missingNumber(int[] nums) {
        int rev=0;
        for(int i=0;i<=nums.length;i++)
        {
            rev^=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            rev^=nums[i];
        }
        return rev;
    }
}