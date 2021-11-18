package org.example.BehavioralPatterns.strategy;

import org.example.BehavioralPatterns.strategy.strategies.Strategy;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class StrategyService {
    private Strategy strategy;

    public StrategyService(Strategy strategy) {
        this.strategy = strategy;
    }

    public String exec(List<String> strings) {
        if(Objects.isNull(strings) || strings.isEmpty())
            return "";

        return strategy.exec(strings);
    }

    public StrategyService setStrategy(@NotNull Strategy strategy) {
        if(Objects.isNull(strategy))
            return this;

        this.strategy = strategy;
        return this;
    }
}
