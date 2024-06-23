package com.fatin.grading_system;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ExamStudent es1 = new ExamStudent("Alice", 1);
        ExamStudent es2 = new ExamStudent("Bob", 2);
        AssignmentStudent as = new AssignmentStudent("Charlie", 3);
        ProjectStudent ps = new ProjectStudent("David", 4);
        
        es1.inputGrades(new double[]{85.0, 90.0, 88.0});
        es2.inputGrades(new String[]{"A", "B", "B+", "A+", "A"});
        as.inputGrades(new double[]{75.0, 80.0, 82.0});
        ps.inputGrades(92);
        
        System.out.printf("%s's Final Exam Grade: %.2f\n\n", es1.name, es1.calculateFinalGrade());
        System.out.printf("%s's Final Exam Grade: %.2f\n\n", es2.name, es2.calculateFinalGrade());
        System.out.printf("%s's Assignment Grade: %.2f\n\n", as.name, as.calculateFinalGrade());
        System.out.printf("%s's Project Grade: %.2f\n\n", ps.name, ps.calculateFinalGrade());
    }
}