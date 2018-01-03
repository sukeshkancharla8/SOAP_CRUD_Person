package com.accolite.crud.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.accolite.crud.models.Person;
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface PersonCRUD {
	@WebMethod Person getPerson(@WebParam(name="username")String username);
	@WebMethod boolean addPerson(@WebParam(name="name")String name, @WebParam(name="username")String username,@WebParam(name="password")String password, @WebParam(name="address")String address, @WebParam(name="contact")String contact, @WebParam(name="")String email);
	@WebMethod boolean updatePerson( @WebParam(name="username")String username,@WebParam(name="name")String name,@WebParam(name="password")String password, @WebParam(name="address")String address, @WebParam(name="contact")String contact, @WebParam(name="")String email);
	@WebMethod boolean deletePerson(@WebParam(name="username")String username);
	@WebMethod ArrayList<Person> getAllPersons();
}
