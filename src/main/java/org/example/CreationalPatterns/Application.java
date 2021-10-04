package org.example.CreationalPatterns;

import org.example.CreationalPatterns.builder.Builder;
import org.example.CreationalPatterns.builder.Constructors.Constructor;
import org.example.CreationalPatterns.builder.Constructors.ConstructorA;
import org.example.CreationalPatterns.builder.Constructors.ConstructorB;
import org.example.CreationalPatterns.builder.House;

public class Application {
    public static void main(String[] args){
        Builder builder = new Builder();
        Constructor constructorA = new ConstructorA();;
        House house1 = builder.Build(constructorA);

        System.out.println(house1.toString());


        Constructor constructorB = new ConstructorB();;
        House house2 = builder.Build(constructorB);

        System.out.println(house2.toString());
    }
}


