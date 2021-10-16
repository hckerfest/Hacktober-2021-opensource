class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int[] arr = new int[201];
        int ans = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            
            arr[nums[i]]++;
            
        }
        
        
        for(int i=k+1;i<201;i++)
        {
            
            ans += arr[i] * arr[i-k];
            
        }
        
        
        return ans;
        
    }
}
