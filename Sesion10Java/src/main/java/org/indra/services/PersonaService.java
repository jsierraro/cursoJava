package org.indra.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.indra.models.Persona;

public class PersonaService implements IPersonaService {

	private String conString;
	
	@Override
	public void setConnectionString(String string){
		try {
			Connection conn = DriverManager.getConnection(this.conString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
