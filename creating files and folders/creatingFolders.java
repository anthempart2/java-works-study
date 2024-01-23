//code to create folders using only java commands
import java.io.File;

public class creatingFolders {

    public static void main(String[] args) {
        // Specify the path for the new folder
        // Also add the name of the file you wanna create alongside the path.
        //here for instance the filename is 'FileNameSample'
        String folderPath = "D:\\FolderNameSample";

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
