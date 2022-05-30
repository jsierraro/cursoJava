package com.example.Sesion14Java.persistence;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.Sesion14Java.models.Empleado;

import lombok.Cleanup;

public class EmpleadosPersistencia implements IEmpleadosPersistencia {

	SessionFactory sf;
	Session session;

	public EmpleadosPersistencia() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		this.sf = conf.buildSessionFactory();
	}

	@Override
	public List<Empleado> getAll() {
		Session session = sf.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Empleado> qry = builder.createQuery(Empleado.class);
		qry.from(Empleado.class);
		List<Empleado> lista = session.createQuery(qry).getResultList();
		session.close();
		return lista;
	}

	@Override
	public Empleado getById(int id) {
		Session session = sf.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Empleado> qry = builder.createQuery(Empleado.class);
		qry.from(Empleado.class);
		Empleado em= session.createQuery(qry).getResultList().stream().filter(e -> e.getId()==id).findFirst().get();
		session.close();
		return em;
	}

	@Override
	public Empleado echoEmpleado(Empleado empleado) {
		return null;
	}

	@Override
	public void addEmpleado(Empleado empleado) {
		Transaction trans = session.beginTransaction();
		
		session.save(empleado);
		
		trans.commit();
	}

}
