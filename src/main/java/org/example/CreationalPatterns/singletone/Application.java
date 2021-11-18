package org.example.CreationalPatterns.singletone;

public class Application {
    public static void main(String[] args){
        SingletoneService con = new SingletoneService();
        System.out.println(con.GetConnection());
        System.out.println(con.GetConnection());
        SingletoneService con2 = new SingletoneService();
        System.out.println(con2.GetConnection());
    }
}

