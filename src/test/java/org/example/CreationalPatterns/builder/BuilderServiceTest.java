package org.example.CreationalPatterns.builder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuilderServiceTest {
    @Test
    public void test() throws Exception {
        BuilderService builderService = new BuilderService();

        House house1 = builderService.initHouse("Тип А");
        assertEquals("Тип дверей у дома: Metal\n" +
                "Количество окон у дома: 2\n" +
                "Цвет фасада дома: Pink",house1.toString());

        House house2 = builderService.initHouse("Тип Б");
        assertEquals("Тип дверей у дома: Wood\n" +
                "Количество окон у дома: 4\n" +
                "Цвет фасада дома: Green",house2.toString());
    }
}
