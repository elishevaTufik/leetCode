class RandomizedSet {
    
    private Map<Integer, Integer> valueToIndex;
    private List<Integer> values;    
    private Random random;   

    public RandomizedSet() {
        valueToIndex = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (valueToIndex.containsKey(val)) {
            return false; 
        }
        valueToIndex.put(val, values.size());
        values.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!valueToIndex.containsKey(val)) {
            return false;
        }
        int index = valueToIndex.get(val);
        int lastValue = values.get(values.size() - 1);
        
        values.set(index, lastValue);
        valueToIndex.put(lastValue, index);
        
        values.remove(values.size() - 1);
        valueToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        return values.get(random.nextInt(values.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */