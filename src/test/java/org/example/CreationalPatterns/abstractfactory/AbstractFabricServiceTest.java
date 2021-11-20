package org.example.CreationalPatterns.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AbstractFabricServiceTest {

    @Test
    public void test() throws Exception {

        AbstractFabricService abstractFabricService = new AbstractFabricService();
        Client client = abstractFabricService.initClient("Ашан");
        assertEquals("Клиент из магазина Ашан", client.GetName());

        client = abstractFabricService.initClient("АшАн");
        assertEquals("Клиент из магазина Ашан", client.GetName());

        client = abstractFabricService.initClient("Магнит");
        assertEquals("Клиент из магазина Магнит", client.GetName());

        client = abstractFabricService.initClient("МаГНИт");
        assertEquals("Клиент из магазина Магнит", client.GetName());
    }
}
