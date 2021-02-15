package ejercicio2;

import java.time.LocalTime;

public class App {
    static IFusible fusible=new IFusible(){
        private boolean encendido=true;
        @Override
        public void encender() {
            this.encendido=true;
        }

        @Override
        public void apagar() {
            this.encendido=false;
        }

        @Override
        public boolean isEncendido() {
            return this.encendido;
        }
    };

    public static void main(String[] args){
        conmutar(fusible,LocalTime.now());
    }

    private static void conmutar(IFusible fusible, LocalTime hora){
        if(!fusible.isEncendido() && hora.getHour()>22) {
            fusible.encender();
        }else{
            fusible.apagar();
        }
    }
}

interface IFusible{
    void encender();
    void apagar();
    boolean isEncendido();
}
