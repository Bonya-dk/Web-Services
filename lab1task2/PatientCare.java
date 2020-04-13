package lab1task2;

public class PatientCare extends Employee
{
  public int permit_number;
  public String permit_expiry_date;

  //Creates a patient care object
  public PatientCare(String name, String address, String phone, 
    int employee_number, int permit_number, String permit_expiry_date)
  {
    super(name, address, phone, employee_number);
    this.permit_number = permit_number;
    this.permit_expiry_date = permit_expiry_date;
  }
  
  //Display details of a patient care object.
  public void print() 
  {
    System.out.println("We care for our patients");
    System.out.println("Hospital Employee Data...");
    System.out.println("Name: "+name);
    System.out.println("Address: "+address);
    System.out.println("Phone Number: "+phone);
    System.out.println("Employee Number: " + employee_number);
  }
}
