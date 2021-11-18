package org.example.BehavioralPatterns.chain.chainhandler;

import org.example.BehavioralPatterns.chain.Request;
import org.jetbrains.annotations.NotNull;

public interface ChainHandler {
    void process(@NotNull Request request);

    ChainHandler next();

    ChainHandler next(ChainHandler chainHandler);

}
