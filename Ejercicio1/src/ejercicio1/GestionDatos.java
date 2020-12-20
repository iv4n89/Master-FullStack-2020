/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author iv4n8
 */
public class GestionDatos {
    
    DatosCliente cliente = new DatosCliente();
    
    /**
     * Añade un valor de tipo String a la propiedad nombre del objeto cliente, correspondiente al nombre.
     */
    private void addNombre(){
        cliente.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del cliente: ", ""));
    }
    
    /**
     * Añade un valor de tipo Integer en la propiedad anho del objeto cliente, correspondiente al año de nacimiento.
     */
    private void addAnho(){
        cliente.setAnho(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de nacimiento del cliente: ", "")));
    }
    
    /**
     * Añade un valor de tipo Integer en la propiedad mes del objeto cliente, correspondiente al mes de nacimiento. La entrada de datos admite tanto el número del mes como el nombre del mes.
     */
    private void addMes(){
        int _mes = 0;
        do{
        String mes = JOptionPane.showInputDialog("Introduzca el mes de nacimiento: ","").toLowerCase();
        switch(mes){
            case "enero","1":
                _mes = 1;
                break;
            case "febrero","2":
                _mes = 2;
                break;
            case "marzo","3":
                _mes = 3;
                break;
            case "abril","4":
                _mes = 4;
                break;
            case "mayo","5":
                _mes = 5;
                break;
            case "junio","6":
                _mes = 6;
                break;
            case "julio","7":
                _mes = 7;
                break;
            case "agosto","8":
                _mes = 8;
                break;
            case "septiembre","9":
                _mes = 9;
                break;
            case "octubre","10":
                _mes = 10;
                break;
            case "noviembre","11":
                _mes = 11;
                break;
            case "diciembre","12":
                _mes = 12;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Has introdicudo un dato no válido. Debes introducir el nombre o número del mes de nacimiento.");
                break;
        }
        }while (_mes==0);
        cliente.setMes(_mes);
    }
    
    /**
     * Añade un valor de tipo Integer a la propiedad dia del objeto cliente, correspondiente al día de nacimiento 
     */
    private void addDia(){
        int _mes=cliente.getMes();
        boolean correcto=false;
        final String MENSAJE_ERROR_DIAS ="Has introducido un número de días incorrecto para el mes que habías introducido.";
        do{       
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de nacimiento del cliente: ", ""));
            switch(_mes){
                case 4,6,9,11 -> {
                    if (dia>0 && dia<=30) {
                        cliente.setDia(dia);
                        correcto=true;
                    } else {
                        JOptionPane.showMessageDialog(null,MENSAJE_ERROR_DIAS);
                    }
                }
                case 1,3,5,7,8,10,12 ->{
                    if (dia>0&&dia<=31){
                        cliente.setDia(dia);
                        correcto=true;
                    }else{
                        JOptionPane.showMessageDialog(null, MENSAJE_ERROR_DIAS);
                    }
                }
                case 2 ->{
                    if(dia>0&&dia<=28){
                        cliente.setDia(dia);
                        correcto=true;
                    }else{
                        JOptionPane.showMessageDialog(null, MENSAJE_ERROR_DIAS);
                    }
                }
            }
            
        }while(!correcto);
    }
    
    public void pedirDatos(){
        addNombre();
        addAnho();
        addMes();
        addDia();
    }
       
}