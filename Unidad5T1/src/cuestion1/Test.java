package cuestion1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEmpleados lista=new ListaEmpleados();
		lista.add(new Empleado("12345678T", "Juanito Turriano", 200.0));
		lista.add(new Empleado("12234567H", "Antonia Fecunda", 350.00));
		lista.add(new Empleado("44563445Y", "Afrodita Escaferros", 1340.76));
		lista.add(new Empleado("54321677T", "Eustaquio Valferrada", 760.87));
		lista.add(new Empleado("55443322U", "Demetrio Doscuellos", 1778.55));
		System.out.println(lista.toString());
		System.out.println("");
		
		lista.ordenaPorNombre();
		System.out.println(lista.toString());
		System.out.println("");
		
		lista.ordenaPorSueldo();
		System.out.println(lista.toString());
		System.out.println("");
		
		System.out.println(String.format("Empleado de mayor sueldo: %s", lista.getEmpleadoMayorSueldo().toString()));
		System.out.println("");
		
		System.out.println(String.format("Empleados con menor sueldo a 400€: %s", lista.empleadosConSueldo(400.00).toString()));
		System.out.println("");
		
		System.out.println(String.format("Sueldo medio de empleados que empiezan por A: %.2f €", lista.sueldoMedioEmpiezanPor('A')));
	}

}
