/*
 * Una clase no hereda constructores. Todo lo demás sí.
 * Si un campo es privado, cuando los hereda no son visibles, pero si los hereda
 * El compilador, cuando se crea una subclase sin un constructor, le mete un compilador sin argumentos.
 */
package version2;

/**
 *
 * @author iv4n8
 */
public class CuentaCredito extends CuentaBancaria{
    public double creditoMaximo=5000;
    private static final String ERR_SALDO = "No puede superar un credito maximo de ";

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }
    
    //constructor por defecto:

    /**
     *
     * @param numero
     */
    public CuentaCredito(String numero){
        super(numero);//invoca el constructor sin argumentos de la clase padre. Pero la clase padre no tiene constructor vacio, por eso da error
    }
    
    /**
     *
     * @param cantidad
     */
    @Override
    public void reintegrar(double cantidad){
        if(getSaldoActual()+5000 < cantidad) throw new RuntimeException(ERR_SALDO + getCreditoMaximo());
        super.reintegrar(cantidad); //con super se llama al metodo heredado. Con this se llama al metodo creado en esta subclase.
    }
    
//    public CuentaCredito(String numero){
//        super(numero);
//    }
//    
//    @Override
//    public void reintegrar(double cantidad){
//        if(getSaldoActual()<cantidad){throw new RuntimeException("");}
//        this.setSaldoActual(this.getSaldoActual()-cantidad);
//    }
    
    
}
