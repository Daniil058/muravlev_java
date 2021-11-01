package org.example.CreationalPatterns.factorymethod;

import org.example.CreationalPatterns.factorymethod.factory.LeftTwixFactory;
import org.example.CreationalPatterns.factorymethod.factory.RightTwixFactory;
import org.example.CreationalPatterns.factorymethod.factory.TwixFactory;
import org.example.CreationalPatterns.factorymethod.product.TwixStick;

public class Application {
    public static void main(String[] args){
        TwixFactory[] twixFactories = {
                new LeftTwixFactory(),
                new RightTwixFactory(),
                new LeftTwixFactory()
        };
        for(TwixFactory twixFactory: twixFactories){
            TwixStick twixStick = twixFactory.factoryMethod();
            System.out.println("Произведена: " + twixStick.GetName());
        }
    }
}
