/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version2;

/**
 *
 * @author iv4n8
 */
public class CuentaDebito extends CuentaBancaria{
    private static final String ERR_SALDO = "El saldo no puede quedar a negativo";
    
    public CuentaDebito(String numero){
        super(numero);
    }

    @Override
    public void reintegrar(double cantidad) {
        if(getSaldoActual()<cantidad) throw new RuntimeException(ERR_SALDO);
        super.reintegrar(cantidad); //con super se llama al metodo heredado. Con this se llama al metodo creado en esta subclase.
    }
    
    
}
