package main;

import java.util.function.Predicate;

public interface RepositoryPerson {
      void insert(Person person);
      void delete(Person person);
      default void update(Person person) {
    	  Person p= find(person.getCode());
  		if(p!=null) {
  			p.setAge(person.getAge());
  			p.setFirstName(person.getFirstName());
  			p.setLastName(person.getLastName());
  		}
      }
      Person find(int code);
      Person[] find(Predicate<Person> filter);
}
