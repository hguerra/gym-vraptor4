package br.com.infra;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Example;

public class GenericHibernateDao<T> implements Dao<T> {

	protected Session session;

	@Override
	public void persist(T t) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		session.save(t);

		session.getTransaction().commit();

		session.flush();

		session.close();
	}

	@Override
	public void remove(T t) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		session.delete(t);

		session.getTransaction().commit();

		session.flush();

		session.close();
	}

	@Override
	public void update(T t) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		session.update(t);

		session.getTransaction().commit();

		session.flush();

		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(Class<?> clazz) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		List<Object> objects = null;
		try {
			objects = session.createCriteria(clazz).list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.getTransaction().commit();

		session.flush();

		session.close();

		return (List<T>) objects;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T search(Serializable id, Class<?> clazz) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		Object object = null;
		try {
			object = session.get(clazz, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.getTransaction().commit();

		session.flush();

		session.close();

		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchFilter(Object filter) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		List<Object> objects = null;
		try {
			objects = session.createCriteria(filter.getClass()).add(Example.create(filter)).list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.getTransaction().commit();

		session.flush();

		session.close();

		return (List<T>) objects;
	}

}
