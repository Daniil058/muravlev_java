package org.example.BehavioralPatterns.chain;

public class Application {
    public static void main(String[] args) {
        String inputStream = "method:GET\npath:/user/info\nsession:8d8464-dsf5565659dsf-d59f5s9";

        ChainService chainService = new ChainService();
        Request request = chainService.exec(inputStream);
        System.out.println("Method : " + request.getMethod());
        System.out.println("Path : " + request.getPath());
        System.out.println("Session : " + request.getSession());
    }
}
