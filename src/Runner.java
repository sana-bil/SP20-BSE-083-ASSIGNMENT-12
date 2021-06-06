import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        HumanResource humanResource= new HumanResource();
        Association association= new Teacher("mam rubina", 1);
        Association association1= new Teacher("sir ali", 2);
        Association association2= new Student("Sara", 1);



        humanResource.add(association);
        humanResource.add(association1);
        humanResource.add(association2);
        humanResource.delete(2);
        System.out.println(humanResource);


        // HumanResource humanResource= new HumanResource();
        //  Association association= new Teacher("mam rubina", 1);
        //Association association1= new Teacher("sir ali", 2);
        //Association association2= new Student("Sara", 1);
        //Association association3= new Student("Zahra", 2);
        //Association association4= new Student("Abdullah",3);

        //humanResource.add(association);
        //humanResource.add(association1);
        //humanResource.add(association2);
        //humanResource.add(association3);
        //humanResource.add(association4);
        //humanResource.delete(4);

        //System.out.println(humanResource);


    }
}
