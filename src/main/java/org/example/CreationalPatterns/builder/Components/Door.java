package org.example.CreationalPatterns.builder.Components;

public class Door {
    private String TypeOfDoor;
    public void setType(String typeOfDoor){
        this.TypeOfDoor = typeOfDoor;
    }
    public String getType(){
        return this.TypeOfDoor;
    }
}
