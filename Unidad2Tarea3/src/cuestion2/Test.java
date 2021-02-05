package cuestion2;

public class Test {

    public static void main(String[] args){
        String testText1="Hola, me llamo Papa Pikillo. Soy subnormal profundo y me pierdo por las montañas";
        Memorando mem= new Memorando(10);
        mem.setArticulo(new String[]{"profundo","montaña"});
        for(String s:mem.articulosCon(testText1)){
            System.out.println(s);
        }
    }
}
