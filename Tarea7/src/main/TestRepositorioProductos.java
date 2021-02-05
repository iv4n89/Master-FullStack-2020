package main;

public class TestRepositorioProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1= new Producto("zanahoria","Zanahoria naranja como siempre");
		Producto producto2= new Producto("pollo","Carne de pollo");
		Producto producto3=new Producto("mango deshidratado", "Mango deshidratado en bolsita");
		Producto producto4=new Producto("Alcachofas grandes y verdes" );
		Producto producto5=new Producto("zanahoria verde","Raras zanahorias verdes");
		
		RepositorioProductos.addProducto(producto1);
		RepositorioProductos.addProducto(producto2);
		RepositorioProductos.addProducto(producto3);
		RepositorioProductos.addProducto(producto4);
		RepositorioProductos.addProducto(producto5);
		
		RepositorioProductos.editProducto(0, producto5);
		RepositorioProductos.addProducto(producto5);
		
		char letra = producto5.getCodigo().charAt(0);
		System.out.println(letra);
		
		System.out.println("Producto en la posicion 0: "+RepositorioProductos.getProducto(0));
		System.out.println("Producto en la posicion 2: "+RepositorioProductos.getProducto(2));
		
		int posicionBuscada=RepositorioProductos.findProducto(producto2);
		System.out.println("Se busca la posicion de producto2 que es: "+posicionBuscada);
		System.out.println(RepositorioProductos.getProducto(posicionBuscada));
		
		Producto[] productos=RepositorioProductos.findAllProductos();
		for(Producto prod:productos) {
			System.out.println(prod);
		}
		
		Producto[] mismoNombre=RepositorioProductos.findProductosByNombre("zana");
		for(Producto prod:mismoNombre) {
			System.out.println("Tiene nombre similar: ");
			System.out.println(prod);
		}
		
		Producto[] mismaLetraCodigo=RepositorioProductos.findProductoByLetraCodigo(letra);
		for(Producto prod:mismaLetraCodigo) {
			System.out.println("Codigo con la misma letra: "+letra);
			System.out.println(prod);
		}
		
	}

}
