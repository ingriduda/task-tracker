import java.util.ArrayList;

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
}

