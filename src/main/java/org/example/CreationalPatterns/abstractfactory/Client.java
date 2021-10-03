package org.example.CreationalPatterns.abstractfactory;

import org.example.CreationalPatterns.abstractfactory.product.chocolate.ChocolateStick;
import org.example.CreationalPatterns.abstractfactory.product.soda.Lemonade;
import org.example.CreationalPatterns.abstractfactory.shop.Ashan;
import org.example.CreationalPatterns.abstractfactory.shop.Shop;

public class Client {
    private Shop shop;
    private ChocolateStick chocolateStick;
    private Lemonade lemonade;


    public Client(Shop shop){
        this.shop = shop;
    }

    public void BuyChocolateStick(){
        this.chocolateStick = shop.GetChocolateStick();
    }
    public String GetNameChocolateStick(){
        return this.chocolateStick.GetName();
    }

    public void BuyLemonade(){
        this.lemonade = shop.GetLemonade();
    }
    public String GetNameLemonade(){
        return this.lemonade.GetName();
    }
    public String GetBuying() {
        String outBuying = "Ваши покупки в магазине "+shop.GetName()+" :\n";
        if (chocolateStick != null)
            outBuying += "Шоколадка: "+GetNameChocolateStick()+"\n";
        if(lemonade != null)
            outBuying += "Лимонад: "+GetNameLemonade()+"\n";
        return outBuying;
    }
}
