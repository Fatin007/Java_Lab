package com.fatin.grading_system;

class ExamStudent extends Student {
    private double[] examMarks;
    private String[] letterGrade;
    private float[] gpa;
    private DataType dataType;
    private double finalGrade;

    public enum DataType {
        MARKS, LETTER_GRADE, GPA;
    }
    
    public ExamStudent(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void inputGrades(double[] examMarks) {
        this.examMarks = examMarks;
        dataType = DataType.MARKS;
    }

    @Override
    public void inputGrades(String[] letterGrade) {
        this.letterGrade = letterGrade;
        dataType = DataType.LETTER_GRADE;
    }
    
    @Override
    public void inputGrades(float[] gpa) {
        this.gpa = gpa;
        dataType = DataType.GPA;
    }

    @Override
    public void calculateFinalGrade(){
        double totalGPA = 0;
        if(dataType == DataType.MARKS){
                for (double x : examMarks) {
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
            finalGrade = totalGPA / examMarks.length;
        }
        else if(dataType == DataType.LETTER_GRADE){
            for (String x : letterGrade) {
                if(x.equals("A+")) totalGPA+=4.0;
                else if(x.equals("A")) totalGPA+=3.75;
                else if(x.equals("A-")) totalGPA+=3.5;
                else if(x.equals("B+")) totalGPA+=3.25;
                else if(x.equals("B")) totalGPA+=3.0;
                else if(x.equals("B-")) totalGPA+=2.75;
                else if(x.equals("C+")) totalGPA+=2.5;
                else if(x.equals("C")) totalGPA+=2.25;
                else if(x.equals("D")) totalGPA+=2.0;
                else if(x.equals("F")) totalGPA+=0.0;
                else totalGPA+=0.0;
            }
            finalGrade = totalGPA / letterGrade.length;
        }
        else if(dataType == DataType.GPA){
            for (float x : gpa) {
                totalGPA+=x;
            }
            finalGrade = totalGPA / gpa.length;
        }
    }

    @Override
    public String toString() {
        calculateFinalGrade();
        String x=String.format("%.2f", finalGrade);
        return super.toString() + "Grade: " + x + "\n";
    }
}