package cuestion2;

import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioDepartamentos repo = new RepositorioDepartamentos();
		System.out.println(repo.addDepartamento("Descanso"));
		System.out.println(repo.addDepartamento("Descanso"));
		
		System.out.println(repo.addEmpleado("Descanso", "Eustaquio"));
		System.out.println(repo.addEmpleado("Gestoria", "Germancio"));
		System.out.println(repo.addEmpleado("Descanso", "Eustaquio"));
		
		Map<String, Integer> mapa= repo.obtenerNumeroEmpleadosPorDepartamento();
		for(String s:mapa.keySet()) {
			System.out.println(String.format("%d empleados en el departamento: %s",mapa.get(s),s ));
		}
	}

}
