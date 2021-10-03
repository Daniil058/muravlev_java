package org.example.CreationalPatterns.singletone;

public class Singletone {
    public static Singletone connections;

    public static Singletone getConnections(){
        if(connections == null){
            connections = new Singletone();
        }
        return connections;
    }
}
