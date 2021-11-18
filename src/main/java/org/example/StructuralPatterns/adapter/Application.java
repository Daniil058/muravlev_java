package org.example.StructuralPatterns.adapter;

public class Application {
    public static void main(String[] args) throws Exception {
        AdapterService adapterService = new AdapterService();
        System.out.println(
                "Совместима ли круглая палка с радиусом 10 + с отверстием радиуса 10 ? ==> " +
                        adapterService.exec("круг", 10 , 10)
        );
        System.out.println(
                "Совместима ли квадратная палка с шириной 10 + с отверстием радиуса 10 ? ==> " +
                        adapterService.exec("квадрат", 10 , 10)
        );
        System.out.println(
                "Совместима ли квадратная палка с шириной 20 + с отверстием радиуса 10 ? ==> " +
                        adapterService.exec("квадрат", 10 , 20)
        );
    }
}
