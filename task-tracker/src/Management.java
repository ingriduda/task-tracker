import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Management {
    private ArrayList<Task> tasks;

    public Management() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task t) {
        tasks.add(t);
    }

    public void removeTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
            }
        }
    }

    public void updateTask(int id, String newDescription) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setDescription(newDescription);
            }
        }
    }

    public void markingTask(int id, String newStatus) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setStatus(newStatus);
            }
        }
    }

    public void listTasks() {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void listTaskDone() {
        for (Task t : tasks) {
            if (t.getStatus().equals("done")) {
                System.out.println(t);
            }
        }
    }

    public void listTaskTodo() {
        for (Task t : tasks) {
            if (t.getStatus().equals("to-do")) {
                System.out.println(t);
            }
        }
    }

    public void listTaskInProgress() {
        for (Task t : tasks) {
            if (t.getStatus().equals("in progress")) {
                System.out.println(t);
            }
        }
    }
    public void saveToJson(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {

            writer.write("[\n");

            for (int i = 0; i < tasks.size(); i++) {
                writer.write(tasks.get(i).toJson());

                if (i < tasks.size() - 1) {
                    writer.write(",\n");
                }
            }

            writer.write("\n]");
            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

