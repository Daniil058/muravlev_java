package org.example.BehavioralPatterns.strategy;

import org.example.BehavioralPatterns.strategy.strategies.ColonSeparetedStrategy;
import org.example.BehavioralPatterns.strategy.strategies.CommaSeparatedStrategy;
import org.example.BehavioralPatterns.strategy.strategies.SemicolonSeparatedStrategy;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {};
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");

        StrategyService strategyService;
        strategyService = new StrategyService(new CommaSeparatedStrategy());
        System.out.println(strategyService.exec(list));

        strategyService = new StrategyService(new ColonSeparetedStrategy());
        System.out.println(strategyService.exec(list));

        strategyService = new StrategyService(new SemicolonSeparatedStrategy());
        System.out.println(strategyService.exec(list));
    }
}
