package org.example.CreationalPatterns.factorymethod;


import org.example.CreationalPatterns.factorymethod.factory.LeftTwixFactory;
import org.example.CreationalPatterns.factorymethod.factory.RightTwixFactory;
import org.example.CreationalPatterns.factorymethod.factory.TwixFactory;

public class FactoryMethodService {
    public TwixFactory initFactory(String str) throws Exception {
        switch (str.toUpperCase()){
            case("ПРАВЫЙ"):
                return new RightTwixFactory();
            case ("ЛЕВЫЙ"):
                return new LeftTwixFactory();
            default:
                throw new Exception("Не известный типа фабрики");
        }
    }
}
