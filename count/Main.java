package count;

public class Main {
    static int test()
    {
        Integer x = 19;
        String m = "Hello";
        try {
            System.out.println("Hello World");
            return 1;
        }
        catch(Exception ex)
        {

        }
        finally
        {
            System.out.println("finally");
            return 0;
        }
    }
    public static void main(String[] args) {
        test();
        Integer i = 10;
        int x = i;
        
        String sentence = 
        "Java is an Object Oriented language and c++ is an Object Oriented language";
        int c = count(sentence,"language");
        System.out.println("count = "+ c);
    }
    // n character string
    // m charcter word
    // n/m m
    static int count(String text,String word) 
    {
        String[] words = text.split(" ");
       
        int wordCount = 0;
        for(int i = 0;i<words.length;i++)
        {
           
            if(words[i].equals(word))
                wordCount++;
        }
        return wordCount;
        // int start = 0,end = word.length() -1;
        // int wordCount = 0;
        // while(end < text.length())
        // {
        //     boolean matched = true;
        //     for(int i = 0;i<word.length();i++)
        //     {
        //         if(text.charAt(start+i) != word.charAt(i))
        //         {   
        //                 matched = false;
        //                 break;
        //         }
        //     }
        //     if(matched)
        //     {
        //         wordCount++;
        //         start += word.length();
        //         end += word.length();
        //     }else {
        //         start++;
        //         end++;
        //     }
            
            
        // }
        // return wordCount;
    }
}
