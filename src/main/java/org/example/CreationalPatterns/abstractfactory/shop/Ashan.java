package org.example.CreationalPatterns.abstractfactory.shop;

import org.example.CreationalPatterns.abstractfactory.product.chocolate.ChocolateStick;
import org.example.CreationalPatterns.abstractfactory.product.chocolate.Twix;
import org.example.CreationalPatterns.abstractfactory.product.soda.CocaCola;
import org.example.CreationalPatterns.abstractfactory.product.soda.Lemonade;

public class Ashan extends Shop{

    @Override
    public Lemonade GetLemonade() {
        return new CocaCola();
    }

    @Override
    public ChocolateStick GetChocolateStick() {
        return new Twix();
    }

    @Override
    public String GetName(){
        return "Ашан";
    }
}
