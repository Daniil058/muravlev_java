package org.example.StructuralPatterns.bridge;

public class Application{
    public static void main(String[] args) throws Exception {
        BridgeService bridgeService = new BridgeService();
        bridgeService.exec("тв");

    }
}
