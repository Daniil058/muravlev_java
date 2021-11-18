package org.example.BehavioralPatterns.iterator.container;

import org.example.BehavioralPatterns.iterator.iter.Iterator;
import org.example.BehavioralPatterns.iterator.iter.NumsIterator;

public class NumsContainer implements Container {
    @Override
    public Iterator getIterator(int[] nums) {
        return new NumsIterator(nums);
    }
}
