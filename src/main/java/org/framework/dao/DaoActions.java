package org.framework.dao;

public interface DaoActions<T> {
   public T add(T obj);
   public T update(T obj);
   public T remove(T obj);
   public T get(T obj);
   public T getAll(T obj);
}
