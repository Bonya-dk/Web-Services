package lab1task3;

public class Driver
{
    private static String createPerson(String firstName,
        String lastName, int age, String occupation, String country,
        double salary)
    {
        Name name = new Name(firstName, lastName);
        Age _age = new Age(age);
        Occupation job = new Occupation(occupation);
        Nationality nation = new Nationality(country);
        Income income = new Income(salary);

        return String.format("%-15s %-15s %-15s %-15s %-15s",
                             name, _age, job, nation,income);
    }
        public static void main(String[] args)
    {
        // Creating details of some people to demonstrate
        String[] people = new String[5];
        people[0] = createPerson("Daniil", "Kudrin", 19, "Student",
            "Kazakhstan", 1000000);
        people[1] = createPerson("Davron", "Sattorov", 20, "Student", 
            "Kyrgyzstan", 500000);
        people[2] = createPerson("Dipesh", "Rawall", 21, "Student", 
            "Nepal", 600000);
        people[3] = createPerson("Super", "Man", 500, "Super-hero",
            "Another world", 8000000);
        people[4] = createPerson("Bonnie", "Rivera", 29, "Teacher", 
            "Kazakhstan", 1000000);

        // Printing details of people
        
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Name", "Age", "Occupation", "Country","Income"));
        
        for(int i=0;i<5;i++)
        {
            System.out.println(people[i]);
        }
    }
}