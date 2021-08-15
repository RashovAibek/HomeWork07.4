package com.example.homework074;

public class Task {
    private String name;
    private String name2;
    private String time;

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getTime() {
        return time;
    }

    public String getPosition() {
        return position;
    }

    public Task(String name, String name2, String time, String position) {
        this.name = name;
        this.name2 = name2;
        this.time = time;
        this.position = position;
    }

    private String   position;
}
