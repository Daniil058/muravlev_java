package org.example.CreationalPatterns.factorymethod;

import org.example.CreationalPatterns.factorymethod.factory.TwixFactory;
import org.example.CreationalPatterns.factorymethod.product.TwixStick;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactoryMethodServiceTest {

    @Test
    public void test() throws Exception {
        FactoryMethodService factoryMethodService = new FactoryMethodService();
        TwixFactory twixFactory1 = factoryMethodService.initFactory("Правый");
        TwixStick twixStick1 = twixFactory1.factoryMethod();

        assertEquals("Правая палочка Twix",twixStick1.GetName());

        TwixFactory twixFactory2 = factoryMethodService.initFactory("Левый");
        TwixStick twixStick2 = twixFactory2.factoryMethod();
        assertEquals("Левая палочка Twix",twixStick2.GetName());
    }
}
