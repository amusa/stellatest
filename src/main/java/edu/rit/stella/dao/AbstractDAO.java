package edu.rit.stella.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

public interface AbstractDAO<E, I> {
	E findById(I id);

	void saveOrUpdate(E e);

	void delete(E e);

	List<E> findByCriteria(Criterion criterion);
}
