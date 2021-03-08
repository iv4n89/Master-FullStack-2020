package cuestion1;

public abstract class Archivo {
    private String nombre;
    private String ruta;
    protected static ListaArchivos<Archivo> archivos = new ListaArchivos<>();

    protected Archivo(){

    }

    protected Archivo(String nombre, String ruta){
        this.nombre=nombre;
        this.ruta=ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public static ListaArchivos<Archivo> obtenerArchivosRuta(String ruta){
        ListaArchivos<Archivo> aux=new ListaArchivos<>();
        for(Archivo archivo:archivos) if(archivo.getRuta().equals(ruta)) aux.add(archivo);
        return aux;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
