package org.indra.services;

import org.hibernate.SessionFactory;

public class ServiceBase {

	protected static SessionFactory sf;
	
	public static void configureSF(SessionFactory factory) {
		ServiceBase.sf = factory;
	}
}
