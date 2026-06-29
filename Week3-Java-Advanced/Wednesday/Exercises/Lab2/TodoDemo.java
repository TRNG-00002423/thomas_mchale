public class TodoDemo {
    public static void main(String[] args) {
        // TODO: add tasks, print, complete one, print again
        TodoListManager myList = new TodoListManager();
        myList.addTask("This is a task");
        myList.addTask("This is a seccond task");
        System.out.println(myList.listTasks());
        myList.completeTask(0);
        System.out.println(myList.listTasks());
    }
}