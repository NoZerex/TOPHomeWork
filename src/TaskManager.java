import java.util.PriorityQueue;

class TaskManager {
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void displayTasks() {
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
