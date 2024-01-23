//this code throws error at the moment
import java.io.File;

public class creatingFolders {

    public static void main(String[] args) {
        // Specify the path for the new folder
        String folderPath = "C:\\";

        // Create a File object representing the directory
        File folder = new File(folderPath);

        // Use the mkdirs() method to create the directory and its parent directories if necessary
        boolean success = folder.mkdirs();

        if (success) {
            System.out.println("Folder created successfully.");
        } else {
            System.err.println("Error creating folder.");
        }
    }
}
