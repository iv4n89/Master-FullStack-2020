package main;

public class EjerciciosConStrings {
    public static void main(String [] args){
        PedidosGestion gestor=new PedidosGestion();
        gestor.add("231    JUAN0070.500");
        gestor.add("034     ANA00170.00");
        System.out.println(gestor);
        gestor.remove(34);
        System.out.println(gestor);
    }
}

class PedidosGestion{
    /*
     * Cada pedido ocupará: un codigo de 3 digitos, destinatario (de 8 caracteres), precio (de 8 caracteres)
     * En un momento dado podemos tener:
     *  pedidos="231     JUAN0070.50034     ANA0170.00"
     */
    private String pedidos="";
    public void add(String pedido){
        pedidos = pedidos.concat(pedido);
    }
    public void remove(int codigo){
        String code= "%03d".formatted(codigo);
        int pos=pedidos.indexOf(code);
        pedidos=pedidos.replace(pedidos.substring(pos,pos+19),"");
    }

    @Override
    public String toString() {
        return pedidos;
    }
}
