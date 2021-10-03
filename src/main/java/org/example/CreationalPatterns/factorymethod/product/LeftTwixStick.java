package org.example.CreationalPatterns.factorymethod.product;

public class LeftTwixStick extends TwixStick{
    private String name = "Левая палочка Twix";
    @Override
    public String GetName(){ return this.name; }
}
