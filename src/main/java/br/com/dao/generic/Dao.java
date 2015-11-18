package br.com.dao.generic;

import java.io.Serializable;

public interface Dao<T> {
	void persist(T t);

	T search(Serializable id);

	void update(T t);

	void remove(T t);

}
