package main;

public class test {
    static int n=1;
    static int m= C.nn;
    Externa.interna i1=new Externa.interna();

    static class C{
        static int nn=n;
    }

    public static void main (String [] args){
        System.out.println(new B());
        Ilambda i=x->x;
    }
}

class A{
    protected int metodo1(int a, int b){
        return 0;
    }

    static final void metodo2(){}
}

class B extends A implements I{
    @Override
    public int metodo1(int a, int b) {
        return super.metodo1(a, b);
    }

}

interface I{
    static int metodo(){ return 0;}
}

interface Ilambda{
    int hazAlgo(int a);
}

class Externa{
    private static double d1=1.0;
    public static class interna{
         protected int d2=2;
         public double metodo(){
            return d1;
        }
    }
}