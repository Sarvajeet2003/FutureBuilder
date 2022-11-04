
package FutureBuilder;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Company{                  // Company mode
    private String name_company;
    private String role;
    private int package_offered;
    private float cgpa_criteria;
    private int numOfCompanies;

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPackage_offered() {
        return package_offered;
    }

    public void setPackage_offered(int package_offered) {
        this.package_offered = package_offered;
    }

    public float getCgpa_criteria() {
        return cgpa_criteria;
    }

    public void setCgpa_criteria(float cgpa_criteria) {
        this.cgpa_criteria = cgpa_criteria;
    }

    public int getNumOfCompanies() {
        return numOfCompanies;
    }

    public void setNumOfCompanies(int numOfCompanies) {
        this.numOfCompanies = numOfCompanies;
    }


    ArrayList<Company> CompanyList=new ArrayList<Company>();
    ArrayList<Student> RegForCompany=new ArrayList<Student>();
    ArrayList<Company> RegPlaceDrive;
    Company(String name_company, String role,float cgpa_criteria,int package_offered){
        Scanner sc = new Scanner(System.in);
        this.name_company=name_company;
        setName_company(this.name_company);
        this.role=role;
        setRole(this.role);
        this.cgpa_criteria=cgpa_criteria;
        setCgpa_criteria(this.cgpa_criteria);
        this.package_offered=package_offered;
        setPackage_offered(this.package_offered);
    }
    Company(){
        this.name_company=getName_company();
        this.role=getRole();
        this.cgpa_criteria=getCgpa_criteria();
        this.package_offered=getPackage_offered();
    }

    public void AddCompanies(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        setNumOfCompanies(num);
        for(int i=0;i<num;i++){
            String name_company = sc.next();
            String role = sc.next();
            float cgpa_criteria=sc.nextFloat();
            int package_offered=sc.nextInt();
            Company c1 = new Company(name_company,role,cgpa_criteria,package_offered);
            CompanyList.add(c1);
        }
    }

    public void getCompanyDetails(){
        System.out.println(CompanyList);
    }


    public void get_cmp_list(){
        System.out.println(CompanyList);
    }

    public void UpdateRole(){
        Scanner sc = new Scanner(System.in);
        String newRole= sc.next();
        setRole(newRole);
        System.out.println("Role Updated Successfully");
    }

    public void UpdatePackage(){
        Scanner sc = new Scanner(System.in);
        int newPackage= sc.nextInt();
        setPackage_offered(newPackage);
        System.out.println("Package Updated Successfully");
    }
    public void UpdateCgpaCriteria(){
        Scanner sc = new Scanner(System.in);
        float newCgCri= sc.nextFloat();
        setCgpa_criteria(newCgCri);
        System.out.println("CGPA Criteria Updated Successfully");
    }
    public void RegInstDrive(){
        Company c1 = new Company();
        RegPlaceDrive.add(c1);
        System.out.println("Your Company has been Successfully Registered for the Placement Drive ");
    }
}