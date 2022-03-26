package com.bookstore.dao;

import java.util.List;

public interface GenericDao<T> {

	public T create(T t);

	public T update(T t);

	public T get(int id);

	public void delete(int id);

	public List<T> listAll();

	public long count();

}
