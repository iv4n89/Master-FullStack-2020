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
public class Programa {
    
    public static void main(String[] args){
        CuentaBancaria cl;
        cl=new CuentaCredito("111111");
        cl.ingresar(100);
        cl.reintegrar(4000);
        System.out.println(cl.getSaldoActual());
        
        CuentaBancaria[] cuentas = new CuentaBancaria[3];
        cuentas[0]=cl;
        cuentas[1]= new CuentaDebito("121212");
        cuentas[1].ingresar(200);
        cuentas[2] = new CuentaHogar("333333");
        cuentas[2].ingresar(500);
        
        for(CuentaBancaria cuenta : cuentas) {
            //((CuentaCredito) cuenta).setCreditoMaximo(2000); -> Esto fuerza a interpretarlo asi. Ësto va a dar error al tratar de hacer algo en un objeto de una clase que no tiene nada que ver con lo que estamos intentando que haga
            
            try{cuenta.reintegrar(50);}catch(RuntimeException ex){System.out.println(ex.getMessage());}
            System.out.println(cuenta.getNumero() + ", " + cuenta.getSaldoActual());
        }
    }
}
