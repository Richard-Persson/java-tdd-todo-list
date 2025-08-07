package com.booleanuk.core;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoList {

    public ArrayList<Task> tasks;

    public TodoList(){

    }
    public TodoList(ArrayList<Task> tasks){
        this.tasks = tasks;
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    };

    public boolean addTask(Task task){

        return false;
    }

    public ArrayList<Task> getAllTask(){

        return null;
    }

    public boolean removeTasks(int number){

        return false;
    }

    public void changeStatus(Task task, String status){

    }

    public ArrayList<Task> getAllCompleteTasks(){

        return null;
    }

    public ArrayList<Task> getAllIncompleteTasks(){

        return null;
    }

    public String searchTask(String name){

        return null;
    }

    public ArrayList<Task> ascAlphabetical(){

        return null;
    }

    public ArrayList<Task> descAlphabetical(){

        return null;
    }

}
