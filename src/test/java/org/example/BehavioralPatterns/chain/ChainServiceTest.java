package org.example.BehavioralPatterns.chain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChainServiceTest {
    @Test
    public void test(){
        String inputStream = "method:POST\npath:/user/data\nsession:dfsdfsfd-sdfewfds-ewf3f45";
        ChainService service = new ChainService();
        Request request = service.exec(inputStream);

        assertEquals("POST", request.getMethod());
        assertEquals("/user/data", request.getPath());
        assertEquals("dfsdfsfd-sdfewfds-ewf3f45", request.getSession());
    }
}
