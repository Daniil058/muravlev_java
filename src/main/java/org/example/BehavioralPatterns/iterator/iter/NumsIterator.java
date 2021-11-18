package org.example.BehavioralPatterns.iterator.iter;


public class NumsIterator implements Iterator {
    int index = 0;
    int[] nums;
    public NumsIterator(int[] nums){
        this.nums = nums;
    }

    @Override
    public boolean hasNext() {
        if (index < nums.length)
            return true;
        return false;
    }

    @Override
    public Object next() {
        return nums[index++];
    }
}
