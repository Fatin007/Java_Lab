package com.fatin.grading_system;

class ProjectStudent extends Student {
    private double projectGrade;
    
    public ProjectStudent(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void inputGrades(double grade) {
        this.projectGrade = grade;
    }
    
    @Override
    public double calculateFinalGrade() {
        return projectGrade;
    }
}
