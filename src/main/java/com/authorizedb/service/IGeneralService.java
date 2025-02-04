package com.authorizedb.service;

import java.util.Optional;

public interface IGeneralService<T> {
    T save(T t);

    Optional findById(Long id);

    Iterable<T> findAll();

    void delete(Long id);
}
