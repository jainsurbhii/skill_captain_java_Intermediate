import java.io.File;// Import the File class
import java.io.FileWriter;//Import the File Writer
import java.io.IOException;// Import this class to handle errors
import java.util.Scanner;// Import the Scanner class to take input

public class Main {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File Name");
        String fileName=sc.next();
        System.out.println("Enter a Sentence");
        String text=sc.nextLine();
        sc.close();
        writeFile(fileName,text);//Function call
    }
    //function to create file and write on the file
    public static void writeFile(String fileName,String text){
        File file =new File(fileName);
        try {
            if (file.createNewFile()){
                FileWriter writer = new FileWriter(fileName);// Creates a FileWriter
                writer.write(text);// Writes the string to the file
                System.out.println("File created with text");
                writer.close();}// Closes the writer
            else {
                System.out.println("File already exits");
            }
        }
        //If file not found then msg will be displayed
        catch (IOException e){
            System.out.println("File not created");
        }

    }
}
