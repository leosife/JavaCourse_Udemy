import java.io.*;

public class Main {
    public static void main(String[] args) {

        InputStream fileStream = Main.class.getClassLoader().getResourceAsStream("output.bin");

        if(fileStream == null){
            System.out.println("File doesnt exist");
            return;
        }
        try(
            DataInputStream dis = new DataInputStream(fileStream)
        ){

            double doubleValue = dis.readDouble();
            char charValue = dis.readChar();
            int intValue = dis.readInt();
            String stringValue = dis.readUTF();

            System.out.println("Double: " + doubleValue);
            System.out.println("Char: " + charValue);
            System.out.println("Int: " + intValue);
            System.out.println("String: " + stringValue);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}