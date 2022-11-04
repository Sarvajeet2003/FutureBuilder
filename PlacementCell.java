package FutureBuilder;
import java.util.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class PlacementCell {

    private int AvgSalary;
    public int getAvgSalary() {
        return AvgSalary;
    }

    public void setAvgSalary(int avgSalary) {
        AvgSalary += avgSalary;
    }

    ArrayList<Student> StudentList ;
    ArrayList<Company> CompanyList ;
    ArrayList<Student> RegisteredStudentList;
    ArrayList<Student> RegForCompany;


    ArrayList<Integer> AveragePackage = new ArrayList<Integer>();
    ArrayList<Company> RegPlaceDrive = new ArrayList<Company>();
    public void open_student_reg(){
        Calendar c  = Calendar.getInstance();
        c.setTime(new Date());
        System.out.println("Registration  Starts on: "+ c.getTime());
        c.add(Calendar.DATE, 10);
        System.out.println("Registration Ends on: "+ c.getTime());
    }

    public void open_cmp_reg(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        System.out.println("Registration Starts on: "+ c.getTime());
        c.add(Calendar.DATE, 5);
        System.out.println("Registration Ends on: "+ c.getTime());        // Date Time Formatter used to print date and time

    }

    public void AvailableCompanies(){
        Student s1 = new Student();
        Company c1 = new Company();
        if(RegisteredStudentList.equals(RegForCompany)){
            System.out.println(RegForCompany);
        }
    }

    public void AvgPackage(){
        Company c1 = new Company();
        for(int i=0;i<c1.getNumOfCompanies();i++){
           setAvgSalary(c1.getPackage_offered());
        }
        System.out.println(getAvgSalary());
    }

    public void GetCmpResult(){
        Student s1 = new Student();
        Company c1 = new Company();
        if(s1.getCgpa()>=c1.getCgpa_criteria()){
            System.out.println("You are Selected, please Accept or Reject this Offer");
        }
        else{
            System.out.println("You Gave a good Try :) but You are not Eligible");
        }
    }

}