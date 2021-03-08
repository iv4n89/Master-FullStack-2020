package cuestion1;

public class Imagen extends Archivo{
    private final String formato;

    private Imagen(String nombre, String ruta, String formato){
        super(nombre, ruta);
        this.formato=formato;
    }

    public String getFormato(){
        return this.formato;
    }

    public static Imagen newImagen(String nombre, String ruta, String formato){
        Imagen aux= new Imagen(nombre,ruta,formato);
        Archivo.archivos.add(aux);
        return aux;
    }

    @Override
    public String toString() {
        return super.toString()+"."+this.getFormato();
    }
}
