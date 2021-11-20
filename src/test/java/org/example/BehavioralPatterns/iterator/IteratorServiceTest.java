package org.example.BehavioralPatterns.iterator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IteratorServiceTest {
    @Test
    public void test(){
        IteratorService iteratorService = new IteratorService();
        int[] digits = {7, 8, 56, 4, 45, 98};
        assertEquals("7 8 56 4 45 98",iteratorService.exec(digits).strip());

        digits = new int[] {0};
        assertEquals("0",iteratorService.exec(digits).strip());
    }
}
