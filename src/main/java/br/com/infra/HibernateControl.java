package br.com.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateControl {
	private static final Configuration configuration = new Configuration()
			.configure();
	@SuppressWarnings("deprecation")
	private static final SessionFactory sessionFactory = configuration
			.buildSessionFactory();

	public synchronized static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public synchronized static Session getSession() {
		return getSessionFactory().openSession();
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}
