package com.cliengo.exercise1;

public class Student {
    private String name;
    private int nota;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean isApproved(){
        return this.nota >= 7;
    }
}
