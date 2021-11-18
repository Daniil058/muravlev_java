package org.example.BehavioralPatterns.chain.chainhandler;

import org.example.BehavioralPatterns.chain.Request;
import org.jetbrains.annotations.NotNull;

public class SessionChainHandler extends AbstractChainHandler{
    private static final String KEY = "session";

    @Override
    public void handle(
            @NotNull Request request
    ) {
        if(request.getHeaders().containsKey(KEY))
            request.setSession(request.getHeaders().get(KEY));
    }

}
