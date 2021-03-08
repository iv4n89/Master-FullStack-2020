package cuestion1;

public class Texto extends Archivo{
    private final String codificacion;

    public Texto(String nombre, String ruta, String codificacion){
        super(nombre,ruta);
        this.codificacion=codificacion;
    }

    public String getCodificacion(){
        return this.codificacion;
    }

    public static Texto newTexto(String nombre, String ruta, String codificacion){
        Texto aux = new Texto(nombre,ruta,codificacion);
        Archivo.archivos.add(aux);
        return aux;
    }

    @Override
    public String toString() {
        return super.toString()+" code: "+this.getCodificacion();
    }
}
