package cuestion2;

import java.util.ArrayList;

public class Memorando {
    public interface IProcesa{
        boolean valida(String art);
    }

    private String titulo;
    private int numeroArticulos;
    private String[] articulo=null;

    public Memorando(int numeroArticulos) {
        this.numeroArticulos = numeroArticulos;
        this.articulo=new String[getNumeroArticulos()];
    }

    public Memorando(String titulo, int numeroArticulos) {
        this.titulo = titulo;
        this.numeroArticulos = numeroArticulos;
        this.articulo=new String[getNumeroArticulos()];
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroArticulos() {
        return numeroArticulos;
    }

    /**
     *
     * @param indice posicion del articulo, contando desde 1
     * @return String articulo de indice que se nos da
     */
    public String getArticulo(int indice) {
        if(indice<1||indice>getNumeroArticulos()) return null;
        return articulo[indice-1];
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArticulo(int indice, String articulo) {


    }

    public String[] articulosQueCumplenCon(IProcesa validacion){
        ArrayList<String> aux=new ArrayList<>();
        for(String art:getArticulo()){
            if(validacion.valida(art)){
                aux.add(art);
            }
        }
        return aux.toArray(new String[0]);
    }

    public String[] articulosCon(String texto){
        ArrayList<String> aux=new ArrayList<>();
        for(String art:articulo){
            if(texto.contains(art)){
                aux.add(articulosQueCumplenCon((a)->a.equals(art))[0]);
            }
        }
        return aux.toArray(new String[0]);
    }
}
