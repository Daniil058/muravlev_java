package org.example.CreationalPatterns.builder.Components;

public class Facade {
    private String Color;

    public void setColor(String color){
        this.Color = color;
    }
    public String getColor(){
        return this.Color;
    }
}
