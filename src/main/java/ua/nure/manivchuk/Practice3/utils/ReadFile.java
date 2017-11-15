package ua.nure.manivchuk.Practice3.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nec on 15.11.17.
 */
public class ReadFile {

    public static List<String> readFile(String fileName){
        List<String> stringList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "Cp1251"))) {
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                stringList.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
