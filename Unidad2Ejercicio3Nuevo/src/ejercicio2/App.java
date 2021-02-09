package ejercicio2;

import java.time.LocalTime;

public class App {

    public static void main (String [] args){
        IFusible fusible= new IFusible() {
            boolean isOn;
            @Override
            public void encender() {
                System.out.println("Esta encendido");
                isOn=true;
            }

            @Override
            public void apagar() {
                System.out.println("Esta apagado");
                isOn=false;
            }

            @Override
            public boolean isEncendido() {
                return isOn;
            }
        };
        conmutar(fusible, LocalTime.now());
    }

    public static void conmutar(IFusible fusible, LocalTime hora){
        if(!fusible.isEncendido()&&hora.getHour()>22) fusible.encender();
        else fusible.apagar();
    }
}
