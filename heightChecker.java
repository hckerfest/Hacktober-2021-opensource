class Solution {
    public int heightChecker(int[] heights) {
        
        int n = heights.length;
        
        int count=0;
     
        int[] expected = Arrays.copyOf(heights,n);
        
        Arrays.sort(expected);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        int i = 0;
        
        
        
        for(int num : expected)
            
        {
            
            if(!map.containsKey(num))
                
            {
                map.put(num,i+1);
                
                i++;
                
            }
            
        }
        
        
        for(int j=0 ;j<n ;j++)
            
        {
            
            if(heights[j]!=expected[j])
            {
                count++;
            }
            
        }
        
        
        
        return count;
        
    }
}
