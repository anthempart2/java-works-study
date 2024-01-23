//code to create files using only java commands
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class creatingFiles {
    public static void main(String args[]) {
        //Add the filename alongside the path
        //here for instance it is FileNameSample
        String filePath = "D:\\FolderNameSample\\FileNameSample.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            //content you want in the file
            writer.write("Hello, greetings from my file!");
        } catch (IOException e){
            System.out.println("Error creating file!" + e.getMessage());
        }
    }
}
