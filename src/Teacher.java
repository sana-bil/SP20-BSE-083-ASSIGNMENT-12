import java.util.Scanner;
public class Teacher extends Person implements Association{
    private String designation;
    private String department;
    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public void associate() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the designation ");
        this.designation=scanner.next();
        System.out.println("Enter the departement ");
        this.department=scanner.next();
    }

    @Override
    public String toString() {
        return "Teacher "+super.toString()+ " ,"+
                "designation='" + designation + '\'' +
                ", department='" + department + '\''+ "]" ;
    }
}
