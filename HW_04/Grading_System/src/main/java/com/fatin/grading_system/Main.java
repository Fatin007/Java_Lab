package com.fatin.grading_system;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ExamStudent es1 = new ExamStudent("Alice", "B210501");
        ExamStudent es2 = new ExamStudent("Bob", "B210502");
        ExamStudent es3 = new ExamStudent("Charlie", "B210503");
        AssignmentStudent as = new AssignmentStudent("David", "B210504");
        ProjectStudent ps = new ProjectStudent("Eve", "B210505");
        
        es1.inputGrades(new double[]{85.0, 90.0, 88.0});
        es2.inputGrades(new String[]{"A", "B", "B+", "A+", "A"});
        es3.inputGrades(new float[]{3.75f, 3.5f, 3.25f, 3.0f, 2.75f});
        as.inputGrades(new double[]{75.0, 80.0, 82.0});
        ps.inputGrades(92);
        
        System.out.println(es1);
        System.out.println(es2);
        System.out.println(es3);
        System.out.println(as);
        System.out.println(ps);    
    }
}