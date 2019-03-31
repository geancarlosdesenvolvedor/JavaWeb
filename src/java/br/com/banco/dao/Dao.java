package br.com.banco.dao;

import java.util.List;

public interface Dao {
    public boolean save(Object object);
    public boolean update(Object object);
    public boolean delete(Object object);
    public Object get(int id);
    public List<Object> get();
    
}
