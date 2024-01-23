// this is a random comment .
import java.io.File;

public class creatingFolders {
    public static void main(String args[]){
        //specifying the path of my new folder
        String folderPath = "D:/";

        File folder = new File(folderPath);

        boolean success = folder.mkdir();

        if(success) {
            System.out.println("Folder created!");
        }
        else{
            System.out.println("Error!");
        }
    }
}