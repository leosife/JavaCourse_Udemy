import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "309_checkingFileExist/src/main/resources/newFile.txt";

        String renamedFilePath = "309_checkingFileExist/src/main/resources/newFileRenamed.txt";

        File file = new File(filePath);

        if(file.exists()){
            System.out.println("File exists");
        } else {
            System.out.println("File doesnt exists");
            try {
                if(file.createNewFile()){
                    System.out.println("File created" + file.getName());
                } else {
                    System.out.println("Failed to create the file");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating a file");
                e.printStackTrace();
            }
        }
        System.out.println("File name "  + file.getName());
        System.out.println("Path name "  + file.getPath());

        File renamedFiled = new File(renamedFilePath);
        if(file.renameTo(renamedFiled)){
            System.out.println("File renamed "+ renamedFiled.getName());
        } else {
            System.out.println("File renaming failed");
        }


    }
}