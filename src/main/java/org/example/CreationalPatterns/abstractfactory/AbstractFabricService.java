package org.example.CreationalPatterns.abstractfactory;

import org.example.CreationalPatterns.abstractfactory.shop.Ashan;
import org.example.CreationalPatterns.abstractfactory.shop.Magnit;

public class AbstractFabricService {
    public Client initClient(String str) throws Exception {
        switch (str.toUpperCase()){
            case("АШАН"):
                return new Client(new Ashan());
            case ("МАГНИТ"):
                return new Client(new Magnit());
            default:
                throw new Exception("Не известный типа магазина");
        }
    }
}
