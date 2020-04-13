package lab1task2;

public class Driver
{
    public static void main (String[] args)
    {   
        Doctor doctor = new Doctor ("Daniil", "Almaty", 
        	"732960625", 22882, 32, "8 april");
        Surgeon surgeon = new Surgeon("Davronbek", "Wroclaw",
        	"732228322", 22881, 52, "7 may");
        Administrator admin = new Administrator("Nikita" ,
        	"Rzeszow", "796232777", 22883);
        doctor.print();
        System.out.println("----------");
        surgeon.print();
        System.out.println("----------");
        admin.orderEquipment();
        System.out.println("----------");
        surgeon.operate();
        System.out.println("\n\n");
    }
}
