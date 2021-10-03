package org.example.CreationalPatterns.factorymethod.product;

public class RightTwixStick extends TwixStick {
    private String name = "Правая палочка Twix";
    @Override
    public String GetName(){
        return this.name;
    }
}
