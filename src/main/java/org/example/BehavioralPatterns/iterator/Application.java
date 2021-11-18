package org.example.BehavioralPatterns.iterator;

public class Application {
    public static void main(String[] args) {
        int[] digits = {6,2,9,1,5};
        IteratorService iteratorService = new IteratorService();
        System.out.println(iteratorService.exec(digits));
    }
}
