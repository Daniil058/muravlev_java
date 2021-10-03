package org.example.CreationalPatterns.factorymethod.factory;

import org.example.CreationalPatterns.factorymethod.product.LeftTwixStick;
import org.example.CreationalPatterns.factorymethod.product.TwixStick;

public class LeftTwixFactory extends TwixFactory{
    @Override
    public TwixStick factoryMethod() {
        return new LeftTwixStick();
    }
}
