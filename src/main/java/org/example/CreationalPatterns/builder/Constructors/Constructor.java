package org.example.CreationalPatterns.builder.Constructors;

import org.example.CreationalPatterns.builder.House;

public abstract class Constructor {
    public House House;

    public House getHouse(){
        return this.House;
    }

    public void BuildHouse(){
        this.House = new House();
    }

    public abstract void setDoor();
    public abstract void setWindow();
    public abstract void setFacade();
}
