package lab1task2;

public class Surgeon extends Doctor
{
	//creates a surgeon
    public Surgeon(String name, String address, String phone, 
    	int employee_number, int permit_number, String permit_expiry_date)
    {
        super(name, address, phone, employee_number, permit_number, 
        	permit_expiry_date);
    }

    //let's a surgeon operate
    public void operate()
    {
        System.out.println("Operation Started!");
        System.out.println("Operating...");
        System.out.println("Operation Ended!");
    }
}