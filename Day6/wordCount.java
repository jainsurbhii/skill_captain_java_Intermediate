import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;// Import the Scanner class to read text files

public class Main {
//function to count words
    public static int wordCount(String word)  {
        int count =0;
        try {
            File file = new File("input.txt");// filename
            Scanner scan = new Scanner(file);
            scan.useDelimiter("\\Z");
            String fileConcat = scan.next();
            System.out.println(fileConcat);
            String temp[] = fileConcat.split("[ ]|[.]|[,]|[ \\t]");
            for (int i = 0; i < temp.length; i++) {
                if (word.equalsIgnoreCase(temp[i])) {
                    count++;
                }
            }
            scan.close();
        }

        //If file not found then msg will be displayed
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        return count;
    }
    public static void main(String[] args) throws FileNotFoundException {
        int count=wordCount("JAVA");//function calling
        System.out.println("Total occurrences of 'java':" + count);
    }
}

