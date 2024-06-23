package com.fatin.grading_system;

class Student {
    public String name;
    public int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void inputGrades(double[] marks) {}
    public void inputGrades(String[] letterGrade) {}
    public void inputGrades(double grade) {}
    public double calculateFinalGrade() {
        return 0.0;
    }
}