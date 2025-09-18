class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]res=new int[2];
        int x=0;
         for(int i=0;i<nums.length;i++)
         {
             //
             for(int j=i+1;j<nums.length;j++)
             {
                if(nums[i]+nums[j]==target)
                {
                    
                     res[x++]=i;
                    res[x++]=j;
                     //nums[j]=-1;

                 }
             }
         }
        // int l=0,r=nums.length-1;
        // while(l<r)
        // {
        //     if(nums[l]+nums[r]==target)
        //     {
        //         res[0]=l;
        //         res[1]=r;

        //     }
        //     else if(nums[l]+nums[r]>target)
        //     {
        //         r--;
        //     }
        //     else if(nums[l]+nums[r]<target)
        //     {
        //         l++;
        //     }
        // }
        return res;
    }
}