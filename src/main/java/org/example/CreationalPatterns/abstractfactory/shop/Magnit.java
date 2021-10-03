package org.example.CreationalPatterns.abstractfactory.shop;

import org.example.CreationalPatterns.abstractfactory.product.chocolate.ChocolateStick;
import org.example.CreationalPatterns.abstractfactory.product.chocolate.Snickers;
import org.example.CreationalPatterns.abstractfactory.product.soda.Fanta;
import org.example.CreationalPatterns.abstractfactory.product.soda.Lemonade;

public class Magnit extends Shop{
    @Override
    public Lemonade GetLemonade(){
        return new Fanta();
    }
    @Override
    public ChocolateStick GetChocolateStick(){
        return new Snickers();
    }
    @Override
    public String GetName(){
        return "Магнит";
    }

}
