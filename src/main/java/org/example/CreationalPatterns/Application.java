package org.example.CreationalPatterns;

import org.example.CreationalPatterns.singletone.Singletone;

public class Application {
    public static void main(String[] args){
        Singletone conncet1 = Singletone.getConnections();
        System.out.println(conncet1);
        Singletone connect2 = Singletone.getConnections();
        System.out.println(connect2);
    }
}


