package org.example.StructuralPatterns.adapter;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdapterServiceTest {
    @Test
    public void test() throws Exception{
        AdapterService adapterService = new AdapterService();

        assertTrue(adapterService.exec("круг", 10, 10));
        assertTrue(adapterService.exec("крУГ", 10, 10));
        assertTrue(adapterService.exec("КРУГ", 10, 10));

        assertFalse(adapterService.exec("круг", 10, 20));

        assertTrue(adapterService.exec("квадрат", 10, 10));
        assertTrue(adapterService.exec("КвАдрАт", 10, 10));
        assertTrue(adapterService.exec("КВАДРАТ", 10, 10));

        assertFalse(adapterService.exec("квадрат", 10, 20));
    }
}
