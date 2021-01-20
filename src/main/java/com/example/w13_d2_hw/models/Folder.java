package com.example.w13_d2_hw.models;

import com.example.w13_d2_hw.models.File;
import com.example.w13_d2_hw.models.User;

import java.util.ArrayList;

public class Folder {
    private String title;
    private User user;
    private ArrayList<File> files;

    public Folder(String title, User user, ArrayList<File> files) {
        this.title = title;
        this.user = user;
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
}