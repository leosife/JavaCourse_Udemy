import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream FileIn =
                    new FileInputStream("316_deserialization/src/resources/student.ser");

            ObjectInputStream in = new ObjectInputStream(FileIn)
        ){
            Student deserializedStudent = (Student)in.readObject();
            System.out.println("Deserialization Completed");
            deserializedStudent.displayStudentDetails();

        } catch (Exception e){
            System.out.println("ERROR");
        }

    }
}