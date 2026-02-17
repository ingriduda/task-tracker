
public class Main{
    public static void main(String[] args) {
        Management m  = new Management();
        m.addTask(new Task(1, "wash dishes", "to-do", "17.2.2026", "17.2.2026"));
        m.addTask(new Task(2, "do homework", "to-do", "17.2.2026", "17.2.2026"));
        m.listTasks();
        m.removeTask(1);
        m.listTasks();
        m.updateTask(2, "walk");
        m.listTasks();
        m.markingTask(2, "in progress");
        m.addTask(new Task(1, "work", "to-do", "17.2.2026", "17.2.2026"));
        m.addTask(new Task(3, "buy groceries", "done", "17.2.2026", "17.2.2026"));
        m.listTaskDone();
        m.listTaskTodo();
        m.listTaskInProgress();
        m.saveTask();
    }
}