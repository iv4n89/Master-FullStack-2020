package main;

import java.util.ArrayList;

public class RepositorioProductos {
	private static ArrayList<Producto> productos;
	
	static {
		productos=new ArrayList<>();
	}
	
	static void addProducto(Producto producto) {
		productos.add(producto);
	}
	
	static void editProducto(int posicion, Producto producto) {
		productos.remove(posicion);
		productos.add(posicion, producto);
	}
	
	static void removeProducto(Producto producto) {
		productos.remove(producto);
	}
	
	static Producto getProducto(int posicion) {
		return productos.get(posicion);
	}
	
	static int findProducto(Producto producto) {
		return productos.indexOf(producto);
	}
	
	static Producto[] findAllProductos() {
		return productos.toArray(new Producto[0]);
	}
	
	static Producto[] findProductosByNombre(String nombre) {
		ArrayList<Producto> nombreSimilar=new ArrayList<>();
		for(Producto prod:productos) {
			if(prod.getNombre().contains(nombre)) {
				nombreSimilar.add(prod);
			}
		}
		return nombreSimilar.toArray(new Producto[0]);
	}
	
	static Producto[] findProductoByLetraCodigo(char letra) {
		ArrayList<Producto> mismaLetra= new ArrayList<>();
		for(Producto prod:productos) {
			if(prod.getCodigo().charAt(0)==letra) {
				mismaLetra.add(prod);
			}
		}
		return mismaLetra.toArray(new Producto[0]);
	}

}
