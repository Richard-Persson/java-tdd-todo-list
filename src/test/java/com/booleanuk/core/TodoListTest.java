package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


    @Test
    public void addTask(){
        Task task1 = new Task("Clean house", "Incomplete");
        Task task2 = new Task("Wash car", "Incomplete");
        TodoList todo = new TodoList();


        Assertions.assertTrue(todo.tasks.contains(task1));
        Assertions.assertFalse(todo.tasks.contains(task2));
    }

    @Test
    public void removeTask(){
        Task task1 = new Task("Clean house", "Incomplete");
        Task task2 = new Task("Wash car", "Incomplete");
        TodoList todo = new TodoList(new ArrayList<>(List.of(task1,task2)));

        todo.removeTasks(1);


        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);

        Assertions.assertTrue(todo.removeTasks(1));
        Assertions.assertFalse(todo.removeTasks(1));

    }


    @Test
    public void getAllTasks(){

        Task task1 = new Task("Clean house", "Incomplete");
        Task task2 = new Task("Wash car", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);
        correct.add(task2);

        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task1,task2)));
        TodoList todoFalse = new TodoList(new ArrayList<>(List.of(task1)));

        Assertions.assertEquals(correct, todoTrue.getAllTask());
        Assertions.assertNotEquals(correct, todoFalse.getAllTask());


    }

    @Test
    public void getCompleteTasks(){

        Task task1 = new Task("Clean house", "Complete");
        Task task2 = new Task("Wash car", "Incomplete");
        Task task3 = new Task("Eat food", "Complete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);
        correct.add(task2);

        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task1,task3)));
        TodoList todoFalse = new TodoList(new ArrayList<>(List.of(task1,task2)));
        TodoList todoNull = new TodoList(new ArrayList<>(List.of(task1,task2,null)));

        Assertions.assertEquals(correct, todoTrue.getAllCompleteTasks());
        Assertions.assertNotEquals(correct,todoFalse.getAllCompleteTasks());
        Assertions.assertNotEquals(correct, todoNull.getAllCompleteTasks());

    }

    @Test
    public void getIncompleteTask(){

        Task task1 = new Task("Clean house", "Complete");
        Task task2 = new Task("Wash car", "Incomplete");
        Task task3 = new Task("Eat food", "Complete");
        Task task4 = new Task("Go to work", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);
        correct.add(task2);

        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task2,task4)));
        TodoList todoFalse = new TodoList(new ArrayList<>(List.of(task1,task2)));
        TodoList todoNull = new TodoList(new ArrayList<>(List.of(task1,task2, null)));

        Assertions.assertEquals(correct, todoTrue.getAllIncompleteTasks());
        Assertions.assertNotEquals(correct, todoFalse.getAllIncompleteTasks());
        Assertions.assertNotEquals(correct, todoNull.getAllIncompleteTasks());

    }

    @Test
    public void changeStatus(){

        Task task3 = new Task("Eat food", "Complete");
        task3.changeStatus("Incomplete");

        Assertions.assertEquals("Incomplete",task3.getStatus());
        Assertions.assertNotEquals("Complete",task3.getStatus());

    }


    @Test
    public void descendingAlphabetical(){

    }

    @Test
    public void ascendingAlphabetical(){

    }



}
