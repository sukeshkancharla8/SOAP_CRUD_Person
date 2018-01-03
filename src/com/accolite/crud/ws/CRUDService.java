package com.accolite.crud.ws;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.accolite.crud.models.Person;

@WebService(endpointInterface="com.accolite.crud.ws.PersonCRUD") 
public class CRUDService implements PersonCRUD{
	ArrayList<Person> persons;
	public CRUDService() {
		persons = new ArrayList<Person>();
	}

	@Override
	public Person getPerson(@WebParam(name="username")String username) {
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getUsername().equals(username)) {
				return persons.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean addPerson(@WebParam(name="name")String name, @WebParam(name="username")String username,@WebParam(name="password")String password, @WebParam(name="address")String address, @WebParam(name="contact")String contact, @WebParam(name="")String email) {
		Person person = new Person(name, username, password, address, contact, email);
		persons.add(person);
		return true;
	}

	@Override
	public boolean updatePerson( @WebParam(name="username")String username,@WebParam(name="name")String name,@WebParam(name="password")String password, @WebParam(name="address")String address, @WebParam(name="contact")String contact, @WebParam(name="")String email) {
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getUsername().equals(username)) {
				persons.get(i).setName(name);
				persons.get(i).setAddress(address);
				persons.get(i).setContact(contact);
				persons.get(i).setEmail(email);
				persons.get(i).setPassword(password);
				return true;
			}
		}
		System.out.println("not found");
		return false;
	}

	@Override
	public boolean deletePerson(@WebParam(name="username")String username) {
		// TODO Auto-generated method stub
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getUsername().equals(username)) {
				persons.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return persons;
	}
}
