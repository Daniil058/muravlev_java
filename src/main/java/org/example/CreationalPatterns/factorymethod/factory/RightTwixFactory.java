package org.example.CreationalPatterns.factorymethod.factory;

import org.example.CreationalPatterns.factorymethod.product.RightTwixStick;
import org.example.CreationalPatterns.factorymethod.product.TwixStick;

public class RightTwixFactory extends TwixFactory{
    @Override
    public TwixStick factoryMethod(){
        return new RightTwixStick();
    }
}
