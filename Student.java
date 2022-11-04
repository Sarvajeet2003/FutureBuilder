package FutureBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private float cgpa;
    private int num_of_students;
    private String choice;
    private boolean status;
    private int roll;
    private  String name;
    private String branch;

    public float getCgpa() {

        return cgpa;
    }

    public void setCgpa(float cgpa) {

        this.cgpa = cgpa;
    }

    public int getNum_of_students() {

        return num_of_students;
    }

    public void setNum_of_students(int num_of_students) {

        this.num_of_students = num_of_students;
    }

    public String getChoice() {

        return choice;
    }

    public void setChoice(String choice) {

        this.choice = choice;
    }

    public boolean isStatus() {

        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRoll() {

        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    ArrayList<Student> StudentList = new ArrayList<Student>();
    Student(String name,int roll,float cgpa,String branch){
//        Scanner sc = new Scanner(System.in);
        this.name = name;
        setName(this.name);
        this.roll = roll;
        setRoll(this.roll);
        this.cgpa = cgpa;
        setCgpa(this.cgpa);
        this.branch = branch;
        setBranch(this.branch);
    }
    Student(){

        this.name = getName();
        this.roll = getRoll();
        this.cgpa = getCgpa();
        this.branch = getBranch();
    }
    public void getStudentDetails(){
        System.out.println(StudentList);
    }
    public  void addStudents(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        setNum_of_students(num);
        for(int i=0;i<num;i++) {
            String name = sc.next();
            int roll = sc.nextInt();
            float cgpa =sc.nextFloat();
            String branch = sc.next();
            Student s1 = new Student(name,roll,cgpa,branch);
            StudentList.add(s1);
        }
    }
    ArrayList<Student> RegisteredStudentList = new ArrayList<Student>();
    public void EnterAsStudent(){
        Scanner sc = new Scanner(System.in);
        String NAME = sc.next();
        int ROLL = sc.nextInt();
        if(NAME==this.name && ROLL==this.roll){
            System.out.println("Welcome: "+this.name);
    }

    }
    ArrayList<Student> RegForCompany;
    public void RegForPlacement(){
        Student s1 = new Student();
        RegisteredStudentList.add(s1);
        System.out.println("Successfully Registered");
    }

    public void Register_For_Company(){
        Student s1 = new Student();
        Company c1 = new Company();
        if(s1.getCgpa()>=c1.getCgpa_criteria()){
            RegForCompany.add(s1);
        }

        System.out.println("Successfully Registered for Company: "+ c1.getName_company());
    }

    public void UpdateCgpa(){
        Scanner sc = new Scanner(System.in);
        float newCgpa = sc.nextFloat();
        setCgpa(newCgpa);
        System.out.println("The Update CGPA is: " + getCgpa());
    }
    public void AcceptOffer(){
        setChoice("Accept");
    }
    public void RejectOffer(){
        setChoice("Reject");
    }
    public void CurrentStatus(){
        System.out.println(getChoice());
    }
}