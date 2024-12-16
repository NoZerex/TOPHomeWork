public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task("Задача 1", 3, "Документация"));
        taskManager.addTask(new Task("Задача 2 ", 2, "Нововведение"));
        taskManager.displayTasks();
    }
}