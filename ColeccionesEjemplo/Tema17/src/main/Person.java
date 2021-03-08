package main;

public class Person implements Comparable<Person> {
	private int code;
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
	}

	public Person(int code, String firstName, String lastName, int age) {
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("[%d: %s %s, edad: %d]", code, firstName, lastName, age);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code + firstName.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.code, o.code);
	}
	
	

}
