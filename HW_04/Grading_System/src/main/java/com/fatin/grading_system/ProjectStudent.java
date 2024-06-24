package com.fatin.grading_system;

class ProjectStudent extends Student {
    private double projectGrade;
    private double finalGrade;
    
    public ProjectStudent(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void inputGrades(double grade) {
        this.projectGrade = grade;
    }
    
    @Override
    public void calculateFinalGrade() {
        finalGrade = projectGrade;
    }

    @Override
    public String toString() {
        calculateFinalGrade();
        String x=String.format("%.2f", finalGrade);
        return super.toString() + "Grade: " + x + "\n";
    }
}
