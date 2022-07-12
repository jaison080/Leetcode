public class Solution{
    public int singleNumber(int[] nums)
    {
        int i,j,count=0,x=0;
        for (i=0;i<nums.length;i++)
        {count=0;
            for(j=0;j<nums.length;j++)
            {
                
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count!=2)
            {
                x=nums[i];
            }
        }
        return x;
    }
}