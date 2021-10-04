package org.example.CreationalPatterns.builder.Constructors;

public class ConstructorA extends Constructor{
    @Override
    public void setDoor() {

        this.House.setDoor("Metal");
    }

    @Override
    public void setWindow() {
        this.House.setWindow(2);
    }

    @Override
    public void setFacade() {
        this.House.setFacade("Pink");
    }
}
