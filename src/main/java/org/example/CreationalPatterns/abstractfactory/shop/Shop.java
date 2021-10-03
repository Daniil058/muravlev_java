package org.example.CreationalPatterns.abstractfactory.shop;

import org.example.CreationalPatterns.abstractfactory.product.chocolate.ChocolateStick;
import org.example.CreationalPatterns.abstractfactory.product.soda.Lemonade;

public abstract class Shop {
    public abstract Lemonade GetLemonade();
    public abstract ChocolateStick GetChocolateStick();
    public abstract String GetName();
}
