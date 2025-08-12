package teacher;
public class teacher {
    private String name;
    private int id;
    private String subject;

    // Static counter to generate unique IDs
    private static int idCounter = 1;

    // Constructor to initialize teacher details
    public teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = idCounter++;  // Assign and then increment the counter
    }

    // Method to display teacher details
    public void displayDetails() {
        System.out.println("Teacher ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Subject      : " + subject);
        System.out.println("---------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        teacher t1 = new teacher("Likitha", "Mathematics");
        teacher t2 = new teacher("Sreehitha", "Science");
        teacher t3 = new teacher("Maha lakshimi", "English");
        teacher t4 = new teacher("Amulya","Geography");

        t1.displayDetails();
        t2.displayDetails();
        t3.displayDetails();
        t4.displayDetails();
    }
}
