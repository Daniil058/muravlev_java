package org.example.BehavioralPatterns.iterator;

import org.example.BehavioralPatterns.iterator.container.NumsContainer;
import org.example.BehavioralPatterns.iterator.iter.Iterator;

public class IteratorService {
    public String exec(int[] nums){
        NumsContainer numsAggregator = new NumsContainer();
        String answer = "";
        Iterator iterator = numsAggregator.getIterator(nums);
        while (iterator.hasNext()){
            answer+=iterator.next()+", ";
        }
        return answer;
    }
}
