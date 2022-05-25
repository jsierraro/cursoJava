package org.indra.services;

import org.hibernate.*;
import org.indra.models.*;

public class LibroService extends ServiceBase implements ILibroService{

	public void add(Libro libro) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(libro);
		
		trans.commit();
	}

}
