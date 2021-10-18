class Solution {
    public int[] arrayRankTransform(int[] arr) {
     
        
        int n = arr.length;
        
        int [] newarr = Arrays.copyOf(arr,n);
        
        Arrays.sort(newarr);
        
        int i=0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : newarr)
            
        {
            
            if(!map.containsKey(num))

            {
                
                map.put(num,i+1);
                i++;
                
            }
        }
        
        for(int j=0;j<n;j++)
            
        {
            
            arr[j] = map.get(arr[j]);
        }
        
        
        return arr;
        
    }
}
