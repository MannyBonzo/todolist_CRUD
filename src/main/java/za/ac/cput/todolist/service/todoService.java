package za.ac.cput.todolist.service;

import za.ac.cput.todolist.model.todo;

import java.util.List;
import java.util.Optional;

public interface todoService {
    //create a todo
    public todo save(todo todo);

    //list all todos
    public List<todo> getAll();

    //get 1 todo
    public Optional<todo> getByID(int id);

    //delete a todo
    public void delete(int id);
}
