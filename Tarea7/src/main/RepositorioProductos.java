package main;

import java.util.ArrayList;

//Corregir. Hay que usar listas, no arrays

public class RepositorioProductos {
	private static Producto[] productos;//Esto tiene que ser una lista
	private static ArrayList<Producto> productosL=new ArrayList<>();
	static {
		if(productos==null) productos=new Producto[100];
	}
	
	static void addProducto(Producto producto) {
		int posicion=0;
		for(int i=0;i<productos.length;i++) {
			if(productos[i]==null) {
				posicion=i;
				break;
			}
		}
		productos[posicion]=producto;
	}
	
	static void editProducto(int posicion, Producto producto) {
		if(productos!=null) {
			productos[posicion]=producto;
		}
	}
	
	static void removeProducto(Producto producto) {
		if(productos!=null) {
			int posicion=findProducto(producto);
			productos[posicion]=null;
		}
		for(int i=0;i<productos.length-1;i++) {
			if(i!=0) {
				if(productos[i]==null&&productos[i+1]!=null) {
					productos[i]=productos[i+1];
				}else if(productos[i-1]==null&&productos[i]!=null) {
					for(int j=0;j<productos.length-1;j++) {
						productos[j]=productos[j+1];
						}
					}
				}
			}
		}
	
	static Producto getProducto(int posicion) {
		if(productos!=null) {
			if(productos[posicion]!=null) return productos[posicion];
			else return null;
		}else return null;
	}
	
	static int findProducto(Producto producto) {
		int posicion=0;
		if(productos!=null) {
			for(int i=0;i<productos.length;i++) {
				if(productos[i]==producto) {
					posicion=i;
					break;
				}
			}
		}
		return posicion;
	}
	
	static Producto[] findAllProductos() {
		if(productos!=null) {
			int posicion=0;
			for(int i=0;i<productos.length;i++) {
				if(productos[i]!=null) continue;
				else {
					posicion=i;
					break;
				}
			}
			
			Producto[] allProductos=new Producto[posicion];
			for(int i=0;i<allProductos.length;i++) {
				allProductos[i]=productos[i];
			}
			return allProductos;
		}else return null;
	}
	
	static Producto[] findProductosByNombre(String nombre) {
		int contador=0;
		Producto[] allProductos=findAllProductos();
		for(Producto prod:allProductos) {
			if(prod.getNombre().contains(nombre)) {
				contador++;
			}
		}
		Producto[] contieneNombre=new Producto[contador];
		for(int i=0,j=0;i<allProductos.length;i++) {
			if(allProductos[i].getNombre().contains(nombre)) {
				contieneNombre[j]=allProductos[i];
				j++;
			}
		}
		return contieneNombre;
	}
	
	static Producto[] findProductoByLetraCodigo(char letra) {
		int contador=0;
		Producto[] allProductos=findAllProductos();
		for(Producto prod:allProductos) {
			if(prod.getCodigo().charAt(0)==letra) {
				contador++;
			}
		}
		Producto[] contieneLetraCodigo=new Producto[contador];
		for(int i=0,j=0;i<allProductos.length;i++) {
			if(allProductos[i].getCodigo().charAt(0)==letra) {
				contieneLetraCodigo[j]=allProductos[i];
				j++;
			}
		}
		return contieneLetraCodigo;
	}
}


