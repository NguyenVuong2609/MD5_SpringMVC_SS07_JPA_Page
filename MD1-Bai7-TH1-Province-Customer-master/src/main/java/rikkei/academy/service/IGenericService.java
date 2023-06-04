package rikkei.academy.service;

import java.util.Optional;

public interface IGenericService<T> {
    Iterable<T> findAll();

    // Tránh trả null (Optional)
    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
