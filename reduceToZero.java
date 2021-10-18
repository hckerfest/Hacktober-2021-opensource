class Solution {
    public int numberOfSteps(int num) {
        
        int digits = 0;
        
        return helper(num,digits);
        
        
    }
    
    int helper(int n,int digits)
    {
        if ( n == 0)
            
        {
            return digits;
        }
        
        
        if(n%2==0)
            
        {
            return helper(n / 2 ,digits+1);
        }
        
        return helper(n - 1,digits+1);
    }
}
