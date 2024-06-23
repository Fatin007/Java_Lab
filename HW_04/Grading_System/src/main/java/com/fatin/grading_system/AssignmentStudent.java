package com.fatin.grading_system;

class AssignmentStudent extends Student {
    private double[] assignmentMarks;
    
    public AssignmentStudent(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void inputGrades(double[] assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }
    
    @Override
    public double calculateFinalGrade(){
        double totalGPA = 0;
        for (double x : assignmentMarks) {
            if(x>=80 && x<=100) totalGPA+=4.0;
            else if(x>=75) totalGPA+=3.75;
            else if(x>=70) totalGPA+=3.5;
            else if(x>=65) totalGPA+=3.25;
            else if(x>=60) totalGPA+=3.0;
            else if(x>=55) totalGPA+=2.75;
            else if(x>=50) totalGPA+=2.5;
            else if(x>=45) totalGPA+=2.25;
            else if(x>=40) totalGPA+=2.0;
            else totalGPA+=0.0;
        }
        return totalGPA / assignmentMarks.length;
    }
}
