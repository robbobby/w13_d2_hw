package com.example.w13_d2_hw.models;

public class File {
    private String name;
    private String fileExtension;
    private int size;
    private Folder folder;

    public File(String name, String fileExtension, int size, Folder folder) {
        this.name = name;
        this.fileExtension = fileExtension;
        this.size = size;
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
