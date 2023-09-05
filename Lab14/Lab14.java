import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;;

public class Lab14{
    public static void main (String args[]){
    File file = new File("ttt.txt");
        try{
            // file.mkdirs();
            file.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Testing");
            pw.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}