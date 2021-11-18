package org.example.CreationalPatterns.abstractfactory;


public class Application {
    public static void main(String[] args) throws Exception {
        AbstractFabricService abstractFabricService = new AbstractFabricService();
        Client client1 = abstractFabricService.initClient("ашан");
        System.out.println( client1.GetName());

        Client client2 = abstractFabricService.initClient("магнит");
        System.out.println( client2.GetName());
    }
}

