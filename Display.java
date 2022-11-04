package FutureBuilder;

public class Display{
    public void Welcome(){
        System.out.println("Welcome to FutureBuilder: ");  
        System.out.println("1) Enter the Application");
        System.out.println("2) Exit the Application");
    }
    public void modeToEnter(){
        System.out.println("Choose The mode you want to Enter in:-");
        System.out.println("1) Enter as FutureBuilder.Student Mode");
        System.out.println("2) Enter as Placement Cell Mode"); 
        System.out.println("3) Enter as Company Mode");
        System.out.println("4) Return To Main Application"); 
    }
    public void place_cell(){
        System.out.println("Welcome to IIITD Placement Cell");
        System.out.println("1) Open FutureBuilder.Student Registrations");
        System.out.println("2) Open Company Registrations"); 
        System.out.println("3) Get Number of FutureBuilder.Student Registrations");
        System.out.println("4) Get Number of Company Registrations");
        System.out.println("5) Get Number of Offered/Unoffered/Blocked Students");
        System.out.println("6) Get FutureBuilder.Student Details");
        System.out.println("7) Get Company Details");
        System.out.println("8) Get Average Package");
        System.out.println("9) Get Company Process Results");
        System.out.println("10) Back");
    }
    public void display_enterStudent(){
        System.out.printf("1) Register For Placement Drive\n" +
                "2) Register For Company\n" +
                "3) Get All available companies\n" +
                "4) Get Current Status\n" +
                "5) Update CGPA\n" +
                "6) Accept offer\n" +
                "7) Reject offer\n" +
                "8) Back");
    }
    public void company_mode(){
        System.out.println("Choose the Company Query to perform-");
        System.out.println("1) Add Company and Details");
        System.out.println("2) Choose Company");
        System.out.println("3) Get Available Companies");
        System.out.println("4) Back");
    }
    public void entering_as_Student(){
        System.out.println(" 1) Register For Placement Drive");
        System.out.println(" 2)Register For Company");
        System.out.printf("3) Get All available companies\n" + "4) Get Current Status\n" + "5) Update CGPA\n" +"6) Accept offer\n" +"7) Reject offer\n" +"8) Back");
    }
    public void student_mode(){
        System.out.println("Choose the FutureBuilder.Student Query to perform--");
        System.out.println("1) Enter as a FutureBuilder.Student(Give FutureBuilder.Student Name, and Roll No.)");
        System.out.println("2) Add students");
        System.out.println("3) Back");
    }

    public void disp_student_reg(){
        System.out.println("Fill in the details:- "); 
        System.out.println("1) Set the Opening time for FutureBuilder.Student registrations ");
        System.out.println("2) Set the Closing time for FutureBuilder.Student registrations ");
    }
    public void disp_cmp_reg(){
        System.out.println("Fill in the details:- "); 
        System.out.println("1) Set the Opening time for A1_2021417.company registrations ");
        System.out.println("2) Set the Closing time for A1_2021417.company registrations ");
    }

    public void ChooseCompanyOperation(){
        System.out.printf("1) Update Role\n" +
                "2) Update Package\n" +
                "3) Update CGPA criteria\n" +
                "4) Register To Institute Drive\n" +
                "5) Back");
    }
    public void Exit(){
        System.out.println("You have chosen to Exit, Happy Placement ");
    }
}