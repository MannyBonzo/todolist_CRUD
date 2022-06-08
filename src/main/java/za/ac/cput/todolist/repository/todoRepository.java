package za.ac.cput.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.todolist.model.todo;

@Repository
public interface todoRepository extends JpaRepository<todo, Integer> {
}
