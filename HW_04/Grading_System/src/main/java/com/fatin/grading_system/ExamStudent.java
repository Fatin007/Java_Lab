package com.fatin.grading_system;

class ExamStudent extends Student {
    private double[] examMarks;
    private String[] letterGrade;
    private DataType dataType;

    public enum DataType {
        MARKS, LETTER_GRADE;
    }
    
    public ExamStudent(String name, int id) {
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
    public double calculateFinalGrade(){
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
            return totalGPA / examMarks.length;
        }
        else if(dataType == DataType.LETTER_GRADE){
            for (String x : letterGrade) {
                if(x.equals("A")) totalGPA+=4.0;
                else if(x.equals("A-")) totalGPA+=3.75;
                else if(x.equals("B+")) totalGPA+=3.5;
                else if(x.equals("B")) totalGPA+=3.25;
                else if(x.equals("B-")) totalGPA+=3.0;
                else if(x.equals("C+")) totalGPA+=2.75;
                else if(x.equals("C")) totalGPA+=2.5;
                else if(x.equals("C-")) totalGPA+=2.25;
                else if(x.equals("D")) totalGPA+=2.0;
                else totalGPA+=0.0;
            }
            return totalGPA / letterGrade.length;
        }
        return 0.0;
    }
}
