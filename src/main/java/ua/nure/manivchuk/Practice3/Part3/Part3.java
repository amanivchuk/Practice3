package ua.nure.manivchuk.Practice3.Part3;

import ua.nure.manivchuk.Practice3.utils.ReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nec on 15.11.17.
 */
public class Part3 {
    private List<String> stringList;
    private StringBuffer stringBuffer;

    public String wordInUpperCase(){
        stringList = ReadFile.readFile("src/main/resources/part3.txt");
        stringBuffer = new StringBuffer();

        List<String> allWords = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();

        for(String s : stringList){
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(s);
            while(matcher.find()){
                allWords.add(matcher.group());

                stringBuffer.append(getUpperLetter(matcher.group())).append(" ");
            }
            stringBuffer.append(System.lineSeparator());
        }
        return stringBuffer.toString();
    }

    private String getUpperLetter(String str){
        char ch = str.charAt(0);
        return str.replace(str.charAt(0), Character.toUpperCase(ch));
    }
}
