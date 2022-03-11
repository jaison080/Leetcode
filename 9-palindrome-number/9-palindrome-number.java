class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int temp=x,sum=0;
        while(x!=0)
        {
            if(x<0)
                return false;
            else
            {
                int r=x%10;
                sum=(sum*10)+r;
                x=x/10;
            }
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
}