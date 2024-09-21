import java.io.*;
import java.util.*;
public class Files1 {
    static void main(String[]args)
    {
        try
        {
            File file = new File("file.txt");
            //PrintWriter outFile = new PrintWriter("file.txt");
            Scanner inputFile = new Scanner(file);
            String fileContent = "";
            while(inputFile.hasNext())
            {
                fileContent += inputFile.nextLine();
                fileContent += "\n";
            }
            System.out.println(fileContent);
            // outFile.println("Hello my first file");
            // outFile.close();
        }catch(FileNotFoundException ex) {

        }finally {

        }
    }
}
