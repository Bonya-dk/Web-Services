package lab1task2;

public class Receptionist extends Administrator
{

	//creates a receptionist
    public Receptionist(String name, String address, String phone, 
    	int employee_number)
    {
        super(name, address, phone, employee_number);
    }

    //answers phone
    public void answerPhone()
    {
        System.out.println("Hello receptionist here...\nHow can I help you");
    }
}