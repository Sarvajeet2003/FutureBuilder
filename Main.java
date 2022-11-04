package FutureBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display d1 = new Display();
        int c = 1;
        while(c==1){
            d1.Welcome();
            int choice = sc.nextInt();
            d1.modeToEnter();
            int choice2 = sc.nextInt();
            switch (choice) {
                case 1:
                    switch (choice2) {
                        case 1:  // Student Mode
                            d1.student_mode();
                            int choiceStudent = sc.nextInt();
                            if (choiceStudent == 1) {//Enter as a Student
                                    Student s1 = new Student();
                                    s1.EnterAsStudent();
                                    d1.entering_as_Student();
                                    int EnterAsStudentChoice = sc.nextInt();
                                    if (EnterAsStudentChoice == 1) { //Reg FOr Plac
                                        s1.RegForPlacement();
                                    }
                                    if (EnterAsStudentChoice == 2) { // Reg For Cmp
                                        s1.Register_For_Company();
                                    }
                                    if (EnterAsStudentChoice == 3) { // Get Ava Cmp
                                        PlacementCell p1 = new PlacementCell();
                                        p1.AvailableCompanies();
                                    }
                                    if (EnterAsStudentChoice == 4) { // Get Cur Status
                                        s1.CurrentStatus();
                                    }
                                    if (EnterAsStudentChoice == 5) { // Update CGPA
                                        s1.UpdateCgpa();
                                    }
                                    if (EnterAsStudentChoice == 6) { //Accept
                                        s1.AcceptOffer();
                                    }
                                    if (EnterAsStudentChoice == 7) { // Reject
                                        s1.RejectOffer();
                                    }
                                    if (EnterAsStudentChoice == 8) { // Back
                                        break;
                                    }
                            }

                            if (choiceStudent == 2) {// Add studnets
                                Student s1 = new Student();
                                s1.addStudents();
                            }
                            if (choiceStudent == 3) { //Exit
                                break;
                            }

                            break;
                        case 2:  // Placement Mode
                            d1.place_cell();
                            int PlacementChoice = sc.nextInt();

                            if(PlacementChoice==1){ // Open STU reg
                                PlacementCell p1 = new PlacementCell();
                                p1.open_student_reg();
                            }
                            if(PlacementChoice==2){ // Open CMP reg
                                PlacementCell p1 = new PlacementCell();
                                p1.open_cmp_reg();
                            }
                            if(PlacementChoice==3){ // Get NO oF STU
                                Student s1 = new Student();
                                s1.getNum_of_students();
                            }
                            if(PlacementChoice==4){// Get NO of CMP
                                Company c1 = new Company();
                                c1.getNumOfCompanies();
                            }
                            if(PlacementChoice==5){  // Get no of Off/Unoff/Blocked
                                continue;
                            }
                            if(PlacementChoice==6){// Get STU details
                                Student s1 = new Student();
                                s1.getStudentDetails();
                            }
                            if(PlacementChoice==7){// Get CMP details
                                Company c1 = new Company();
                                c1.getCompanyDetails();
                            }
                            if(PlacementChoice==8){ // Get AVG Package
                                PlacementCell p1 = new PlacementCell();
                                p1.AvgPackage();
                            }
                            if(PlacementChoice==9){ // Get CmP Result
                                PlacementCell p1 = new PlacementCell();
                                p1.GetCmpResult();
                            }
                            if(PlacementChoice==10){ //BACK
                                break;
                            }

                        case 3:  // Company Mode
                            d1.company_mode();
                            int CompanyChoice = sc.nextInt();

                            if(CompanyChoice==1){ //ADD CMP
                                Company c1 = new Company();
                                c1.AddCompanies();
                            }
                            if(CompanyChoice==2){ //Choose CMP
                                    Company c1 = new Company();
                                    c1.get_cmp_list();
                                    String CompanyName = sc.next();
                                    d1.ChooseCompanyOperation();
                                    int ChoiceCmpOperation = sc.nextInt();
                                    if(ChoiceCmpOperation==1){
                                        c1.UpdateRole();
                                    }
                                    if(ChoiceCmpOperation==2){
                                        c1.UpdatePackage();
                                    }
                                    if(ChoiceCmpOperation==3){
                                        c1.UpdateCgpaCriteria();
                                    }
                                    if(ChoiceCmpOperation==4){
                                        c1.RegInstDrive();
                                    }
                                    if(ChoiceCmpOperation==5){
                                        break;
                                    }

                            }
                            if(CompanyChoice==3){ // Get CMP List
                                Company c1 = new Company();
                                c1.getCompanyDetails();
                            }
                            if(CompanyChoice==4){ //BACK
                                break;
                            }
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    d1.Exit();
                    c=0;
                    break;
            }
        }
    }
}
