package org.example.BehavioralPatterns.iterator;

import org.example.BehavioralPatterns.iterator.container.NumsContainer;
import org.example.BehavioralPatterns.iterator.iter.Iterator;

public class IteratorService {
    public String exec(int[] nums){
        NumsContainer numsAggregator = new NumsContainer();
        StringBuilder answer = new StringBuilder();
        Iterator iterator = numsAggregator.getIterator(nums);
        while (iterator.hasNext()){
            answer.append(iterator.next()).append(" ");
        }
        return answer.toString();
    }
}
