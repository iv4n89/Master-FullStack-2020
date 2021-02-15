package cuestion1;

public class App {

    public static void main(String [] args){
        Expresion s1=new Suma(new Numero(1.2),new Numero(0.8));
        System.out.println(s1);
        Expresion s2=new Suma(s1,new Numero(1.0));
        System.out.println(s2);
        Expresion p1=new Producto(new Numero(2.2),new Numero(2.3));
        System.out.println(p1);
    }


}
