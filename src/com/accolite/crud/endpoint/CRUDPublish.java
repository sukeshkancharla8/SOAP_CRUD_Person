package com.accolite.crud.endpoint;

import javax.xml.ws.Endpoint;

import com.accolite.crud.ws.CRUDService;

public class CRUDPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/ws/crudPerson", new CRUDService());
	}

}
