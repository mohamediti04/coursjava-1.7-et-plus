package edu.developpementdigital.heritage.cast;

public class Student extends Person{

    private int studentId;
    private String studentBranch;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    @Override
    public void showInformation() {

      //  super.showInformation();
        System.out.println("Student information");
        System.out.println("Student ID : "+this.studentId);
        System.out.println("Student Branch : "+this.studentBranch);
    }
}
