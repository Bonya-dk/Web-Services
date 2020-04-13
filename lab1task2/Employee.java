package lab1task2;

public class Employee {
	   public String name, address, phone;
	   public int employee_number;

	   //Creates an employee
	   public Employee (String name, String address, String phone,
	      int employee_number) 
	   {
	      this.name = name;
	      this.address = address;
	      this.phone = phone;
	      this.employee_number = employee_number;
	   }

	   //prints details of an employee
	   public void print () {
	      System.out.println("Hospital Employee Data...");
	      System.out.println("Name: "+name);
	      System.out.println("Address: "+address);
	      System.out.println("Phone Number: "+phone);
	      System.out.println("Employee Number: "+employee_number);
	   }
	}