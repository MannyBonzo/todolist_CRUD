package za.ac.cput.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.todolist.model.todo;
import za.ac.cput.todolist.service.todoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class todoController {
    @Autowired
    private todoService todoService;

    @PostMapping("/add")
    public String add(@RequestBody todo todo) {
        todoService.save(todo);
        return "todo added";
    }

    @GetMapping("/getAll")
    public List<todo> getAll() {
        return todoService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<todo> get(@PathVariable int id) {
        return todoService.getByID(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody todo todo) {
        todoService.save(todo);
        return "Todo Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        todoService.delete(id);
        return "todo deleted";
    }
}
