package org.example.CreationalPatterns.builder;

import org.example.CreationalPatterns.builder.Constructors.ConstructorA;
import org.example.CreationalPatterns.builder.Constructors.ConstructorB;

public class BuilderService {
    Builder builder = new Builder();
    public House initHouse(String str) throws Exception {
        switch (str.toUpperCase()){
            case ("ТИП А"):
                return builder.Build(new ConstructorA());
            case ("ТИП Б"):
                return builder.Build(new ConstructorB());
            default:
                throw new Exception("Не известный типа дома");
        }
    }
}
