package com.example.clientegestor.model.dao;

import java.util.List;

public interface InterfaceDAO <T> {
    Integer add(T o) throws Exception;

    boolean delete(long id) throws Exception;

    boolean update(T o) throws Exception;

    List<T> listAll() throws Exception;

    String find(String id) throws Exception;

    Integer findID (String id) throws Exception;
}
