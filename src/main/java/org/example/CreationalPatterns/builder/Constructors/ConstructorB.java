package org.example.CreationalPatterns.builder.Constructors;

public class ConstructorB extends Constructor{

    @Override
    public void setDoor() {
        this.House.setDoor("Wood");
    }

    @Override
    public void setWindow() {
        this.House.setWindow(4);
    }

    @Override
    public void setFacade() {
        this.House.setFacade("Green");
    }
}
