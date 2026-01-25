public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(new Task("Review lecture notes"));
        manager.addTask(new Task("Complete group coursework"));
        manager.addTask(new Task("Assesment prep and resources looked at"));

        manager.completeTask(1);

        manager.printTasks();
    }
}
