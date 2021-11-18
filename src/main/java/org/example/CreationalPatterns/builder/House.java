package org.example.CreationalPatterns.builder;

import org.example.CreationalPatterns.builder.Components.Door;
import org.example.CreationalPatterns.builder.Components.Facade;
import org.example.CreationalPatterns.builder.Components.Window;

public class House {
    private Window Window;
    private Facade Facade;
    private Door Door;


    public void setWindow(int countOfWindow){
        this.Window = new Window();
        this.Window.setCountOfWindow(countOfWindow);
    }

    public int getWindow(){
        return this.Window.getCountOfWindow();
    }

    public void setDoor(String typeOfDoor){
        this.Door = new Door();
        this.Door.setType(typeOfDoor);
    }

    public String getDoor(){
        return this.Door.getType();
    }

    public void setFacade(String color) {
        this.Facade = new Facade();
        this.Facade.setColor(color);
    }

    public String getFacade() {
        return this.Facade.getColor();
    }
    @Override
    public String toString(){
        String out = "";
        if(Door != null)
            out += "Тип дверей у дома: "+this.getDoor();
        if(Window!= null)
            out += "\nКоличество окон у дома: "+this.getWindow();
        if(Facade!= null)
            out += "\nЦвет фасада дома: "+this.getFacade();
        return out;
    }
}
