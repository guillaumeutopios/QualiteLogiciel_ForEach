```java
@Service
public class TaskService {
    // Méthode d'origine avec une complexité cyclomatique élevée
    public int calculatePriority(Task task) {
        int priority = 0;
        if (task.isUrgent()) {
            if (task.getDeadline().isBefore(LocalDate.now())) {
                priority = 10;
            } else {
                priority = 5;
            }
        } else {
            if (task.getCategory().equals("High")) {
                priority = 8;
            } else if (task.getCategory().equals("Medium")) {
                priority = 5;
            } else {
                priority = 2;
            }
        }
        return priority;
    }

    // Méthode refactorisée avec une complexité cyclomatique réduite
    public int calculatePriorityRefactored(Task task) {
        if (task.isUrgent() && task.getDeadline().isBefore(LocalDate.now())) {
            return 10;
        } else if (task.isUrgent()) {
            return 5;
        } else if (task.getCategory().equals("High")) {
            return 8;
        } else if (task.getCategory().equals("Medium")) {
            return 5;
        } else {
            return 2;
        }
    }
}

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate deadline;
    private boolean isUrgent;
    private String category;

    // Getters and Setters
}

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/priority")
    public int calculateTaskPriority(@RequestBody Task task) {
        // Appel de la méthode refactorisée
        return taskService.calculatePriorityRefactored(task);
    }
}

@SpringBootApplication
public class TaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}

```