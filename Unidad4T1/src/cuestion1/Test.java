package cuestion1;

public class Test {
    public static void main(String [] args){
        Texto t1= Texto.newTexto("texto1","ruta1","UTF-8");
        Imagen i1=Imagen.newImagen("imagen1","ruta1","jpeg");
        Imagen i2=Imagen.newImagen("imagen2","ruta2","png");
        Texto t2=Texto.newTexto("texto2","ruta1","UTF-16");
        System.out.println("Archivos en 'ruta2': "+Archivo.obtenerArchivosRuta("ruta2"));
        System.out.println("Archivos en 'ruta1': "+Archivo.obtenerArchivosRuta("ruta1"));
    }
}
