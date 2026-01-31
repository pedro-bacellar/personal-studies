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
                if(time < 0){
                    System.out.println("Times over");
                    timer.cancel();
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, (time * 100));
    }

    void listTasks(){
        for(Task task : storage.getAll()){
            System.out.println(task);
        }
    }

}
