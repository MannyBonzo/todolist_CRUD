package za.ac.cput.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.todolist.model.todo;
import za.ac.cput.todolist.repository.todoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class todoServiceImpl implements todoService {

    @Autowired
    private todoRepository todoRepository;

    @Override
    public todo save(todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public Optional<todo> getByID(int id) {
        return todoRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        todoRepository.deleteById(id);
    }
}
