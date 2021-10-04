package org.example.CreationalPatterns.builder;


import org.example.CreationalPatterns.builder.Constructors.Constructor;

public class Builder {
    public House Build(Constructor constructor){
        constructor.BuildHouse();
        constructor.setDoor();
        constructor.setFacade();
        constructor.setWindow();
        return constructor.getHouse();
    }
}
