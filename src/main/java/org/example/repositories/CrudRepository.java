package org.example.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    Optional<T> findById(Long id);

    List<T> findAll();

    void save(T entity);

    void update(T entity);

    void remove(Long id);
}
