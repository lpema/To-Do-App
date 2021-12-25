package com.TodoApp.pema.addedittask;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.TodoApp.pema.database.AppDatabase;
import com.TodoApp.pema.database.Repository;
import com.TodoApp.pema.database.TaskEntry;

public class AddEditTaskViewModel extends AndroidViewModel {

    Repository repository;
    LiveData<TaskEntry> task;

    AddEditTaskViewModel(Application application, int taskId){
        super(application);
        AppDatabase database = AppDatabase.getInstance(application);
        repository = new Repository(database);
        if(taskId != -1)
            task = repository.getTaskById(taskId);
    }


    public LiveData<TaskEntry> getTask(){
        return task;
    }

    public void insertTask(TaskEntry task){
        repository.insertTask(task);
    }

    public void updateTask(TaskEntry task){
        repository.insertTask(task);
    }


}
