package main;

import java.util.*;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SetRepositoryPerson implements RepositoryPerson {

	private Set<Person> persons=new TreeSet<>();
	
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		if(!persons.add(person)) throw new RuntimeException("Ya existe");
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		persons.remove(person);
	}

//	@Override
//	public void update(Person person) {
//		Person p= find(person.getCode());
//		if(p!=null) {
//			p.setAge(person.getAge());
//			p.setFirstName(person.getFirstName());
//			p.setLastName(person.getLastName());
//		}
//	}

	@Override
	public Person find(int code) {
		for(Person p:persons) {
			if(p.getCode()==code) {
					return p;
			}
		}
		return null;
	}

	@Override
	public Person[] find(Predicate<Person> filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
