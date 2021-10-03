package org.example.CreationalPatterns;

import org.example.CreationalPatterns.abstractfactory.Client;
import org.example.CreationalPatterns.abstractfactory.shop.Ashan;
import org.example.CreationalPatterns.abstractfactory.shop.Magnit;

public class Application {
    public static void main(String[] args){
        Client[] client = {new Client(new Ashan()), new Client(new Magnit())};

        client[0].BuyChocolateStick();

        client[1].BuyLemonade();
        client[1].BuyChocolateStick();

        System.out.println("Клиент 1:\n" + client[0].GetBuying());

        System.out.println("Клиент 2:\n" + client[1].GetBuying());
    }
}


