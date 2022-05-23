package org.indra.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import org.indra.model.*;

public class PersonaHibernateService implements IPersonaService {

	private SessionFactory factory;

	public PersonaHibernateService(SessionFactory factory) {
		this.factory = factory;
	}

	public void add(Persona persona) {

		Session session = this.factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(persona);

		transaction.commit();
		session.close();
	}

	@SuppressWarnings("deprecation")
	public List<Persona> getall() {
		Session session = this.factory.openSession();

//		List<Persona> lista = session.createCriteria(Persona.class).list();
//		List<Persona> lista = session.createQuery("FROM Persona").getResultList();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Persona> qry = builder.createQuery(Persona.class);
		qry.from(Persona.class);
		List<Persona> lista = session.createQuery(qry).getResultList();
		session.close();
		return lista;
	}

	@Override
	public void delete(int id) {
		Session session = this.factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Persona p = session.get(Persona.class, id);
		session.delete(p);
		//session.createQuery(String.format("delete FROM Persona where Id='%s'",id)).executeUpdate();

		transaction.commit();
		session.close();
	}

}
