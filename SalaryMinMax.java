class Solution {
    public double average(int[] nums) {
     
        
        int max = 0;
        int min = 9999999;
        int n = nums.length;
        int sum=0;
        
        
        double avg = 0;
        
        for(int i=0 ; i< n ; i++)
            
        {
            
            if(nums[i] > max)
            {
                max=nums[i];
                // c++;
            }
            
            
            if(nums[i] < min)
            
            {
                
                min = nums[i];
                // c++;
                
            }
            
        }
        
        
        for(int i=0 ;i < n ; i++)
        {
            
            sum = sum + nums[i];
            
        }
        
         avg = sum - max - min;
        
         int m = n - 2;
        
        
        return avg / m ;
        
        
    }
}
