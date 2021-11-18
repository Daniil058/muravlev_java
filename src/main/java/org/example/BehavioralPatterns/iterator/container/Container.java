package org.example.BehavioralPatterns.iterator.container;

import org.example.BehavioralPatterns.iterator.iter.Iterator;

public interface Container {
    Iterator getIterator(int[] nums);
}
