package org.example.BehavioralPatterns.strategy.strategies;

import org.jetbrains.annotations.NotNull;

import org.apache.commons.lang3.StringUtils;
import java.util.List;

public class SemicolonSeparatedStrategy implements Strategy {
    @NotNull
    @Override
    public String exec(@NotNull List<String> strings) {
        return StringUtils.join(strings, ";");
    }
}
