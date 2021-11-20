package org.example.BehavioralPatterns.strategy;

import org.example.BehavioralPatterns.strategy.strategies.ColonSeparetedStrategy;
import org.example.BehavioralPatterns.strategy.strategies.CommaSeparatedStrategy;
import org.example.BehavioralPatterns.strategy.strategies.SemicolonSeparatedStrategy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

public class StrategyServiceTest {

    @Test
    public void test(){
        List<String> strings = new ArrayList<>();
        strings.add("Первая");
        strings.add("Вторая");
        strings.add("Третья");
        strings.add("Четвертая");
        strings.add("Пятая");

        StrategyService service = new StrategyService(new CommaSeparatedStrategy());
        assertEquals("Первая,Вторая,Третья,Четвертая,Пятая", service.exec(strings));

        service = new StrategyService(new SemicolonSeparatedStrategy());
        assertEquals("Первая;Вторая;Третья;Четвертая;Пятая", service.exec(strings));

        service = new StrategyService(new ColonSeparetedStrategy());
        assertEquals("Первая:Вторая:Третья:Четвертая:Пятая", service.exec(strings));
    }
}
