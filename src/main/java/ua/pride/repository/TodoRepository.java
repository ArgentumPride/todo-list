package ua.pride.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.pride.entity.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
