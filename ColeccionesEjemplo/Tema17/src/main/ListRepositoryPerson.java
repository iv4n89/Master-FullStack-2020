package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;


public class ListRepositoryPerson implements RepositoryPerson {

	private List<Person> persons=new LinkedList<Person>();
	
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		final String ERROR="Persona ya existe";
		if(persons.contains(person)) throw new RuntimeException(ERROR);
			
		persons.add(person);
		
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		persons.remove(person);
	}

//	@Override
//	public void update(Person person) {
//		// TODO Auto-generated method stub
//		Person buscado=find(person.getCode());
//		if(buscado!=null) {
//			buscado.setAge(person.getAge());
//			buscado.setFirstName(person.getFirstName());
//			buscado.setLastName(person.getLastName());
//		}
//	}

	@Override
	public Person find(int code) {
		for(Person p:persons) {
			if(p.getCode()==code) return p;
		}
		return null;
	}

	@Override
	public Person[] find(Predicate<Person> filter) {
		List<Person> aux=new ArrayList<>();
		for(Person p:persons) {
			if(filter.test(p)) {
				aux.add(p);
			}
		}
		return aux.toArray(Person[]::new);
	}

}
