import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Leonardo", 101, 20);

        try(FileOutputStream fileOut = new FileOutputStream("315_serialization/src/resources/student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)

        ){
            out.writeObject(student);
            System.out.println("Great Job");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}