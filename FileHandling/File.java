package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
//        try(FileWriter fw=new FileWriter("notes.txt",true)){
//            fw.write("Aur kaisa hai chutiye?");
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage()+"Error aa gaya bhai!!");
//        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt", true))) {
            bw.write("Aur kaisa hai chutiye?");
            bw.newLine(); // optional for next line
            System.out.println(System.getProperty("user.dir"));
        }
        catch (IOException e) {
            System.out.println("Error aa gaya bhai!! " + e.getMessage());
        }
    }
}
