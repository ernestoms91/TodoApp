package com.menchaca.rest.app.Controller;

import com.menchaca.rest.app.MODEL.Task;
import com.menchaca.rest.app.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private  TodoRepository  todoRepository;

   @GetMapping(value = "/")
   public String holaMundo(){
        return "Hola MundoE";
    }

   @GetMapping(value="/tasks")
    public List<Task> getTasks(){
       return todoRepository.findAll();
   }

   @PostMapping(value="/new")

    public  String saveTask(@RequestBody Task task){
       todoRepository.save(task);
       return  "Save task";
   }

    @PutMapping (value="/update/{id}")
    public  String updateTask(@PathVariable long id ,@RequestBody Task task){
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        todoRepository.save(updatedTask);
        return  "Updated task";
    }

    @DeleteMapping (value="/delete/{id}")
    public  String deleteTask(@PathVariable long id){
        todoRepository.deleteById(id);
        return  "Deleted task";
    }

}
