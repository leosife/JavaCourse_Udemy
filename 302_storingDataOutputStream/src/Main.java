import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("302_storingDataOutputStream/src/main/resources/output.bin");
            DataOutputStream dos = new DataOutputStream(fos)
        ){

            dos.writeDouble(3.14);
            dos.writeChar('H');
            dos.writeInt(42);
            dos.writeUTF("This is a string");
            dos.flush();
        } catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}