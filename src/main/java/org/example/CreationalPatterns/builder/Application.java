package org.example.CreationalPatterns.builder;



public class Application {
    public static void main(String[] args) throws Exception {



        BuilderService builderService = new BuilderService();
        House house1 = builderService.initHouse("Тип А");
        System.out.println(house1.toString());

        House house2 = builderService.initHouse("Тип Б");

        System.out.println(house2.toString());
    }
}
