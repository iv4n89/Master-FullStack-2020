package main;

public class TestRepositorioProductos {

	public static void main(String...args) {
		Producto productoTest=new Producto("testing","testing");
		RepositorioProductos.addProducto(new Producto());
		RepositorioProductos.addProducto(new Producto("zanahoria","zanahorias normales"));
		RepositorioProductos.addProducto(productoTest);
		
		for(Producto prod:RepositorioProductos.findAllProductos()) {
			System.out.println(prod);
		}
		
		RepositorioProductos.editProducto(0, new Producto("albahaca",""));
		
		for(Producto prod:RepositorioProductos.findAllProductos()) {
			System.out.println(prod);
		}
		
		System.out.println(RepositorioProductos.getProducto(0));
		System.out.println(RepositorioProductos.findProducto(productoTest));
		
		for(Producto prod:RepositorioProductos.findProductosByNombre("zanah")) {
			System.out.println("Buscando 'zanah', resultados");
			System.out.println(prod);
		}
		
		for(Producto prod:RepositorioProductos.findProductoByLetraCodigo(productoTest.getCodigo().charAt(0))) {
			System.out.println("Buscando por codigo de producto, similares al inicio con la letra: "+productoTest.getCodigo().charAt(0));
			System.out.println(prod);
		}
	}
	
}
