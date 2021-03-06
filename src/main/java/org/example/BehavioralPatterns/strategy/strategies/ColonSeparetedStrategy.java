package org.example.BehavioralPatterns.strategy.strategies;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;
/**
 * Класс разделителей ':'
 */
public class ColonSeparetedStrategy implements Strategy {
    @NotNull
    @Override
    public String exec(@NotNull List<String> strings) {
        return StringUtils.join(strings, ':');
    }
}
