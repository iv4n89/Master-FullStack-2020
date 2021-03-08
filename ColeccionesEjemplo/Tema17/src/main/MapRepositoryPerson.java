package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Predicate;

public class MapRepositoryPerson implements RepositoryPerson {

	private Map<Integer, Person> persons=new TreeMap<>();
	
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		if(persons.containsKey(person.getCode())) throw new RuntimeException("Ya existe");
		persons.put(person.getCode(), person);
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void update(Person person) {
//		if(!persons.containsKey(person.getCode())) throw new RuntimeException("No existe");
//		persons.put(person.getCode(), person);
//	}

	@Override
	public Person find(int code) {
		return persons.get(code);
	}

	@Override
	public Person[] find(Predicate<Person> filter) {
		List<Person> aux=new ArrayList<>();
		for(Entry<Integer,Person> p:persons.entrySet()) {
			if(filter.test(p.getValue())) {
				aux.add(p.getValue());
			}
		}
		return aux.toArray(Person[]::new);
	}

}
