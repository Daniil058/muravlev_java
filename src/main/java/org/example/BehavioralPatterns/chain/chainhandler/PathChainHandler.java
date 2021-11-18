package org.example.BehavioralPatterns.chain.chainhandler;

import org.example.BehavioralPatterns.chain.Request;
import org.jetbrains.annotations.NotNull;

public class PathChainHandler extends AbstractChainHandler {
    private static final String KEY = "path";

    @Override
    public void handle(
            @NotNull Request request
    ) {
        if(request.getHeaders().containsKey(KEY))
            request.setPath(request.getHeaders().get(KEY));
    }
}
