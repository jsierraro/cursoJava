package org.indra.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.indra.model.Persona;

public class PersonaJdbRepository implements IPersonaRepository {

	public void add(Persona persona) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:persona.db");
			PreparedStatement ps = conn
					.prepareStatement(String.format("insert into Persona (Nombre,Apellido) VALUES ('%s','%s');",
							persona.getNombre(), persona.getApellido()));
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
