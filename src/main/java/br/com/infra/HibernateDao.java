package br.com.infra;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;

public class HibernateDao<T> implements Dao<T> {

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
	public T search(Serializable id, Class<?> clazz) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		T object = null;
		try {
			object = (T) session.get(clazz, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.getTransaction().commit();

		session.flush();

		session.close();

		return object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(Class<?> clazz) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		List<T> objects = null;
		try {
			objects = session.createCriteria(clazz).list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.getTransaction().commit();

		session.flush();

		session.close();

		return objects;
	}
	

	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchFilter(T filter) {
		session = HibernateControl.getSession();

		session.beginTransaction();

		Example example = Example.create(filter)
			    .enableLike(MatchMode.ANYWHERE);
		
		List<T> objects = null;
		try {
			objects = session.createCriteria(filter.getClass())
					.add(example).list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.getTransaction().commit();

		session.flush();

		session.close();

		return objects;
	}

}
