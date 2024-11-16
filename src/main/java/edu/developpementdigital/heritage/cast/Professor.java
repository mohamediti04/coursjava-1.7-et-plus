package edu.developpementdigital.heritage.cast;

public class Professor extends Person{
    private int professorId;
    private double professorSalary;

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public double getProfessorSalary() {
        return professorSalary;
    }

    public void setProfessorSalary(double professorSalary) {
        this.professorSalary = professorSalary;
    }
    public void getMaxSalary(){
        System.out.println("Salary = "+10000+"DH");
    }

    @Override
    public void showInformation() {
        System.out.println("Professor information");
        System.out.println("Professor ID : "+this.professorId);
        System.out.println("Professor Salary : "+this.professorSalary);
    }
}
