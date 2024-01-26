package com.example.app.task;

import com.example.app.task.controller.Controller;
import com.example.app.task.controller.TaskController;
import com.example.app.task.controller.TimeoutController;
import com.example.app.task.repository.DatabaseTaskRepository;
import com.example.app.task.repository.TaskRepository;
import com.example.app.task.service.TaskService;

import java.util.ArrayList;
import java.util.List;

public class Injector {

    /*
    A central place to create all classes.
    Dependency Injection via constructor injection.
     */
    public List<Controller> createController() {
        List<Controller> controllerList = new ArrayList<>();

        TaskRepository taskRepository = new DatabaseTaskRepository();
        TaskService taskService = new TaskService(taskRepository);
        controllerList.add(new TaskController(taskService));

        controllerList.add(new TimeoutController());

        return controllerList;
    }
}
