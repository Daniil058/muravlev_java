package org.example.BehavioralPatterns.strategy.strategies;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Strategy {
    @NotNull
    String exec(@NotNull List<String> strings);
}
