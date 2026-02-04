import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TaskManager {

    Scanner scanner = new Scanner(System.in);
    Storage<Task> storage = new Storage<>();

    void addTask(){
        System.out.print("Enter the task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the task description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter the time in seconds: ");
        int time = scanner.nextInt();
        scanner.nextLine();

        Task task = new Task(name, desc, time);

        storage.add(task.getId(), task);

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Times over");
                timer.cancel();
            }
        };
        timer.schedule(timerTask, time * 1000L);
        task.setTimer(timer);
    }

    void completeTask(int id){
        try {
            Task task = storage.get(id);
            task.setStatus(true);
            if (task.getTimer() != null){
                task.getTimer().cancel();
            }
            System.out.println("Task complete!");
        }
        catch (NullPointerException e){
            System.out.println("Invalid task ID");
        }
    }

    void viewTaskDetails(int id){
        try {
            Task task = storage.get(id);
            String s = task.getStatus() ? "Completed" : "Pending";

            System.out.println("Name: " + task.getName());
            System.out.println("Description: " + task.getDesc());
            System.out.println("Status: " + s);
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Invalid task ID");
        }
    }

    void listTasks(){
        for(Task task : storage.getAll()){
            System.out.println(task);
        }
    }

    void showMenu(){
        System.out.println("=== TASK TIME MANAGER ===");
        System.out.println();
        System.out.println("1 - Add Task");
        System.out.println("2 - List Tasks");
        System.out.println("3 - Complete Task");
        System.out.println("4 - View Task Details");
        System.out.println("5 - Exit");
        System.out.println();
        System.out.print("Enter option: ");
    }

    void run() {

        boolean isRunning = true;

        while (isRunning){
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> listTasks();
                case 3 -> {
                    System.out.print("Enter the task id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    completeTask(id);
                }
                case 4 -> {
                    System.out.print("Enter the task id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    viewTaskDetails(id);
                }
                case 5 -> {
                    isRunning = false;
                }
            }
        }
    }
}