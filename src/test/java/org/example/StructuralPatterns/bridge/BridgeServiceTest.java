package org.example.StructuralPatterns.bridge;

import org.example.StructuralPatterns.bridge.devices.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BridgeServiceTest {

    @Test
    public void test() throws Exception {
        BridgeService bridgeService = new BridgeService();
        Device tv = new Tv();
        Device radio = new Radio();
        assertEquals(tv.getClass(), bridgeService.exec("тв").getClass());
        assertEquals(radio.getClass(), bridgeService.exec("рАдИо").getClass());
    }
}
