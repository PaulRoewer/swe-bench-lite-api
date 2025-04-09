package de.data_experts.sweverifier.controller;

import de.data_experts.sweverifier.model.Task;
import de.data_experts.sweverifier.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/index/{index}")
    public Task getByIndex(@PathVariable int index) {
        return taskService.getTaskByIndex(index);
    }

}
