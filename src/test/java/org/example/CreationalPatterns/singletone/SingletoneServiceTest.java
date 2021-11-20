package org.example.CreationalPatterns.singletone;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingletoneServiceTest {
    @Test
    public void test() {
        SingletoneService con1 = new SingletoneService();
        SingletoneService con2 = new SingletoneService();
        assertEquals(con1.GetConnection(), con2.GetConnection());

        SingletoneService con3 = new SingletoneService();
        assertEquals(con1.GetConnection(), con3.GetConnection());
        assertEquals(con2.GetConnection(), con3.GetConnection());
    }
}
