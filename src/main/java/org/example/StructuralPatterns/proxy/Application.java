package org.example.StructuralPatterns.proxy;

public class Application {
    public static void main(String[] args) throws Exception {
        ProxyService proxyService = new ProxyService();
        proxyService.exec("улучшенный");
    }
}
