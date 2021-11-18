package org.example.CreationalPatterns.factorymethod;


import org.example.CreationalPatterns.factorymethod.factory.TwixFactory;
import org.example.CreationalPatterns.factorymethod.product.TwixStick;

public class Application {
    public static void main(String[] args) throws Exception {

        FactoryMethodService factoryMethodService = new FactoryMethodService();


        TwixFactory twixFactory1 = factoryMethodService.initFactory("Правый");

        TwixStick twixStick1 = twixFactory1.factoryMethod();
        System.out.println("Произведена: " + twixStick1.GetName());

        TwixFactory twixFactory2 = factoryMethodService.initFactory("Левый");
        TwixStick twixStick2 = twixFactory2.factoryMethod();
        System.out.println("Произведена: " + twixStick2.GetName());
    }
}
