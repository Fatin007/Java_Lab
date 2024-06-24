package com.fatin.grading_system;

class Student {
    public String name;
    public String id;
    
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public void inputGrades(double[] marks) {}
    public void inputGrades(String[] letterGrade) {}
    public void inputGrades(float[] gpa) {}
    public void inputGrades(double grade) {}
    public void calculateFinalGrade() {}

    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\n";
    }
}