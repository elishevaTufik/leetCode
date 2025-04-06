class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (frequencyMap.containsKey(key)) {
                frequencyMap.put(key, frequencyMap.get(key) + 1);
            } else {
                frequencyMap.put(key, 1);
            }
        }
        
        // בודק אם כל התדירויות הן ייחודיות
        Set<Integer> occurrenceSet = new HashSet<>();
        Iterator<Integer> it = frequencyMap.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            int count = frequencyMap.get(key);
            // אם לא ניתן להוסיף את התדירות למערך, משמעות הדבר שיש כפילות
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }
        return true;
    }
}