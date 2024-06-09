package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    Set<Task> taskList;

    public TaskList() {
        this.taskList = new HashSet<>();
    }
    public void addTask(String description) {
        this.taskList.add(new Task(description.toLowerCase()));
    }
    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task task: this.taskList){
            if (task.getDescription().equalsIgnoreCase(description)){
                taskToRemove = task;
                break;
            }
        }
        this.taskList.remove(taskToRemove);
    }
    public Set<Task> displayTasks() {
        return this.taskList;
    }
    public int countTask() {
        return this.taskList.size();
    }
    public Set<Task> getCompletedTasks(){
        Set<Task> completedTasks = new HashSet<>();
        for (Task task: taskList) {
            if (task.isDone()){
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }
    public Set<Task> getPendingTasks(){
        Set<Task> pendingTasks = new HashSet<>();
        for (Task task: taskList) {
            if (!task.isDone()){
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }
    public void markTaskCompleted(String description) {
        for (Task t : this.taskList){
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(true);
                break;
            }
        }
    }
    public void markTaskPending(String description) {
        for (Task t : this.taskList){
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(false);
                break;
            }
        }
    }
    public void removeAllTasks() {
        this.taskList.clear();
    }

    public static void main(String[] args) {
        TaskList t = new TaskList();
        //System.out.println(t.displayTasks());
        t.addTask("Criar site");
        t.addTask("CRiar site");
        t.addTask("Fazer comida");
        //System.out.println(t.countTask());
        System.out.println(t.displayTasks());
        t.markTaskCompleted("criar site");
        System.out.println(t.displayTasks());
        //t.removeTask("fazer comida");
        //System.out.println(t.displayTasks());
        System.out.println(t.getPendingTasks());
        System.out.println(t.getCompletedTasks());
        t.removeAllTasks();
        System.out.println(t.displayTasks());

    }
}

