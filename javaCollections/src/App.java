import java.io.*;
import java.util.Arrays;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner fileInput = new Scanner(new FileInputStream("javaCollections\\src\\words.txt"));
        String file = "";
        while(fileInput.hasNext())
        {
            file += fileInput.nextLine();
            file += " ";
        }
        List<String> words = Arrays.asList(file.split(" "));
        System.out.println(words);
        Map<String,ArrayList<String>> dictionary = new HashMap<>();

        words.forEach((String word)->{
            ArrayList<String> newWords = dictionary.get(("" + word.charAt(0)).toUpperCase()) == null ? new ArrayList<>():dictionary.get(("" + word.charAt(0)).toUpperCase());
            newWords.add(word);
            dictionary.put(("" + word.charAt(0)).toUpperCase(),newWords);
        });
        for(Map.Entry<String,ArrayList<String>> entry: dictionary.entrySet())
        {
            System.out.println(entry);
        }
        
    }
}
