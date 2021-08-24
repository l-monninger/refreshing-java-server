package utils.toy.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;


public class Read {
    
    public static String getFileString(String filename){

       try {

            final File newFile = new ClassPathResource(filename).getFile();
            final Scanner myScanner = new Scanner(newFile);

            String result = "";
            while(myScanner.hasNextLine()){
                result += myScanner.nextLine();
            }

            myScanner.close();
            return result;

        } catch(FileNotFoundException e){

            return e.toString();

        } catch (IOException e){
            return e.toString();
        }

    }

}
