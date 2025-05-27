import java.util.*;
class Solution {


    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        
        for (int i=0; i<arr.length; i++){
            if(hashMap.containsKey(arr[i])) {
            	hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else {
            	hashMap.put(arr[i],1);
            }
        }

        Collection<Integer> c=hashMap.values();
        Set<Integer> set = new HashSet<>(c);

        if(c.size()!=set.size())
        	return false;
        
        return true;       
    }
}