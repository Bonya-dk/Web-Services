package lab1task2;

public class Administrator extends Employee
{
	//Creates an administrator
	public Administrator(String name, String address, String phone, 
		int employee_number)
    {
        super(name, address, phone, employee_number);
    }

    //pays salary to the employees
    public void paySalary()
    {
    	System.out.println("All employees have been paid.");
    }

    //orders equipment
    public void orderEquipment()
    {
    	System.out.println("Equipment ordered!");
    }
}
