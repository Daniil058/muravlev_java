package org.example.BehavioralPatterns.chain.chainhandler;

import org.example.BehavioralPatterns.chain.Request;
import org.jetbrains.annotations.NotNull;

public class MethodChainHandler extends AbstractChainHandler{
    private static final String KEY = "method";

    @Override
    void handle(
            @NotNull Request request
    ) {
        if(request.getHeaders().containsKey(KEY))
            request.setMethod(request.getHeaders().get(KEY));
    }
}
