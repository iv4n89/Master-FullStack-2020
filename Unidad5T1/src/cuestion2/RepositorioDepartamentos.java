package cuestion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RepositorioDepartamentos {
	private static Map<String, List<String>> departamentos=new HashMap<>();
	
	static {
		//Datos de prueba
		departamentos.put("Informatica", new ArrayList<>(Arrays.asList("Juan","Maria")));
		departamentos.put("Finanzas", new ArrayList<>());
		departamentos.put("Comercio",null);
	}
	
	public boolean addDepartamento(String departamento) {
		//Debe añadir un nuevo departamento si aun no exite
		if(departamentos.containsKey(departamento)) return false;
		departamentos.put(departamento,new ArrayList<>());
		return true;
	}
	
	public boolean addEmpleado(String departamento, String empleado) {
		//Debe añadir un nuevo empleado al departamento dado
		if(!departamentos.containsKey(departamento)) return false;
		if(departamentos.get(departamento)==null) departamentos.put(departamento, new ArrayList<String>());
		if(departamentos.get(departamento).contains(empleado)) return false;
		departamentos.get(departamento).add(empleado);
		return true;
	}
	
	public Map<String, Integer> obtenerNumeroEmpleadosPorDepartamento(){
		//Debe retornar un mapa con el nombre del departamento y su numero de empleados
		Map<String,Integer> aux=new HashMap<>();
		for(String s: departamentos.keySet()) {
			if(departamentos.get(s)!=null) {
				aux.put(s, departamentos.get(s).size());
			}else aux.put(s, 0);
		}
		return aux;
	}
}
