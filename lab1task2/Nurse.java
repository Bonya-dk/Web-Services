package lab1task2;

public class Nurse extends Employee
{
	public boolean isORSet = false;

	//Constructor
	public Nurse(String name, String address, String phone, 
		int employee_number)
	{
		super(name, address, phone, employee_number);
	}

	//sets Operating Room for operation
	public void setOR()
	{
		isORSet = true;
	}
}
