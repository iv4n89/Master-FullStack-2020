package main;

public class Tarea7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1= new Cliente(); //Creacion del objeto cliente 1 son valor en las propiedades
		Cliente cliente3= new Cliente("Alberto",2222);//Creacion del objeto cliente 3 con valores en las propiedades
		
		cliente1.setNombre("Amanciosogumero");//Se añade valor a la propiedad nombre del objeto cliente1
		cliente1.setIdentificacion(1234);//Se añade valor a la propiedad identificacion del objeto cliente1
		System.out.println(cliente1); //Se imprime en pantalla nombre e identificacion del objeto cliente1 a traves del metodo toString de la clase Cliente
		Cliente cliente2=cliente1; //Se crea el objeto cliente2 y se hace que apunte a la misma direccion de memoria que el objeto cliente1
		System.out.println((cliente1.equals(cliente2)?"Son iguales":"No son iguales")); //Se comparan los objetos cliente1 y cliente2 y se imprime una frase segun el resultado
		Cliente[] clientes= {cliente1,cliente2,cliente3}; //Se guardan los tres clientes en un array de tipo Cliente
		for(Cliente cliente:clientes) System.out.println(cliente); //Se imprimen nombre e identificacion de cada objeto de tipo Cliente dentro del array clientes
		cliente2.setNombre("Juan"); //Se modifica el valor de la propiedad nombre del objeto cliente2. Al estar apuntando a la misma direccion de memoria que el objeto cliente1, tambien cambiara la propiedad en este
		System.out.println((cliente1.equals(cliente2)?"Son iguales":"No son iguales")); //Se vuelven a comparar los objetos cliente1 y cliente2
		for(Cliente cliente:clientes) System.out.println(cliente); //Se vuelven a imprimir nombre e identificacion de cada objeto de tipo Cliente en el array clientes
	}

}
