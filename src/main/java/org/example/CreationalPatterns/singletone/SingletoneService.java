package org.example.CreationalPatterns.singletone;

public class SingletoneService {
    public Singletone GetConnection() {
        Singletone connect = Singletone.getConnections();
        return connect;
    }
}
