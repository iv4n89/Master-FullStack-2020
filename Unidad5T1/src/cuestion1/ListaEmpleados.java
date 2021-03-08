package cuestion1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaEmpleados extends ArrayList<Empleado> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void ordenaPorNombre() {
		final Comparator<Empleado> COMP_NOMBRE= (t,o)->t.getNombre().compareToIgnoreCase(o.getNombre());
		this.sort(COMP_NOMBRE);
	}
	
	public void ordenaPorSueldo() {
		final Comparator<Empleado> COMP_SUELDO= (t,o)->(int)(t.getSueldo()-o.getSueldo());
		this.sort(COMP_SUELDO);
	}
	
	public Empleado getEmpleadoMayorSueldo() {
		ordenaPorSueldo();
		return this.get(this.size()-1);
	}
	
	public List<Empleado> empleadosConSueldo(double sueldoMaximo){
		List<Empleado> aux=new ArrayList<>();
		for(Empleado e:this) {
			if(e.getSueldo()<=sueldoMaximo) {
				aux.add(e);
			}
		}
		return aux;
	}
	
	private List<Empleado> empleadosEmpiezanPor(char primeraLetra){
		List<Empleado> aux=new ArrayList<Empleado>();
		for(Empleado e:this) {
			if(e.getNombre().charAt(0)==primeraLetra) {
				aux.add(e);
			}
		}
		return aux;
	}
	
	private double calculateMedia(List<Empleado> list) {
		double aux=0.0;
		for(Empleado e:list) {
			aux+=e.getSueldo();
		}
		return aux/list.size();
	}
	
	public double sueldoMedioEmpiezanPor(char primeraLetra) {
		List<Empleado> aux=empleadosEmpiezanPor(primeraLetra);
		return calculateMedia(aux);
	}
}
