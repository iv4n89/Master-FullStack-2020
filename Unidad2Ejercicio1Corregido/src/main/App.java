package main;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        Consumible b1=new Bolleria("panecillo","un panecillo",null,true);
        System.out.println(b1);
        Consumible b2=new Refresco("Zumo","un zumo",null, LocalDate.of(2021,8,8),TipoEnvase.brick,50,true);
        System.out.println(b2);
    }
}
