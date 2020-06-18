package freelib.services.api;

import java.util.List;

public interface Service<K, T> {
    List<T> getAll();
    T getById(K key);
    void save(T entity);
    void delete(K key);
    void update(int i,T entity);
}
