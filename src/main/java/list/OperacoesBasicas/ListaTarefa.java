package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private final List<Tarefa> taskList;

    public ListaTarefa() {
        this.taskList = new ArrayList<>();
    }
    public void addTask(String description) {
        taskList.add(new Tarefa(description));
    }
    public  void removeTask(String description) {
        List<Tarefa> tasksForRemove = new ArrayList<>();
        for (Tarefa task: taskList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksForRemove.add(task);
            }
        }
        taskList.removeAll(tasksForRemove);
    }
    public int getTotalTasks() {
        return  taskList.size();
    }
    public void getTaskDescriptions() {
        System.out.println(taskList);
    }
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        System.out.println(lista.getTotalTasks());
        lista.addTask("Criar site");
        System.out.println(lista.getTotalTasks());
        lista.addTask("teste");
        lista.getTaskDescriptions();
        lista.removeTask("criar site");
        lista.getTaskDescriptions();


    }
}
