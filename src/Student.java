import java.util.Scanner;
public class Student extends Person implements Association{
    private int rollNo;
    private int semester;
    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void associate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roll no. ");
        this.rollNo=scanner.nextInt();
        System.out.println("Enter the semester number ");
        this.semester=scanner.nextInt();
    }

    @Override
    public String toString() {
        return  "Student " + super.toString()+" ,"+
                "rollNo=" + rollNo +
                ", semester=" + semester +" ]" ;
    }
}
