package ua.nure.manivchuk.Practice3.utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Lenovo on 11/19/2017.
 */
public class Util_test {
    public static String getInput(String fileName){
        StringBuilder sb = new StringBuilder();
        try{
            Scanner scanner = new Scanner(new File(fileName),"UTF-8");
            while(scanner.hasNextLine()){
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            return sb.toString().trim();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return sb.toString();
    }
}
