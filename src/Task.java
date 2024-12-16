class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public int compareTo(Task task) {
        if (this.priority != task.priority) {
            return Integer.compare(this.priority, task.priority);
        } else {
            return this.category.compareTo(task.category);
        }
    }

    @Override
    public String toString() {
        return "Задача: " + "Название = " + name + ", приоритет = " + priority + ", категория = " + category + '}';
    }
}
