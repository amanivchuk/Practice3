package ua.nure.manivchuk.Practice3.Part2;

import ua.nure.manivchuk.Practice3.utils.ReadFile;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nec on 15.11.17.
 */
public class Part2 {
    private List<String> stringList;
    private StringBuffer stringBuffer;

    public void getMinAndMaxWords(){
        stringList = ReadFile.readFile("src/main/resources/part2.txt");
        stringBuffer = new StringBuffer();

        List<String> allWords = new ArrayList<>();

        String list = stringList.toString();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(list);
        while(matcher.find()){
            allWords.add(matcher.group());
        }

        Map<Integer, Set<String>> mapStr = new HashMap<>();
        for(String s : allWords){
            if(! mapStr.containsKey(s.length())){
                mapStr.put(s.length(), new HashSet<>());
            }
            mapStr.get(s.length()).add(s);
        }

        Integer[] keys = mapStr.keySet().toArray(new Integer[mapStr.size()]);
        Arrays.sort(keys);

        System.out.print("Shortest: ");
        for(String s : mapStr.get(keys[0])){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("Longest: ");
        for(String s : mapStr.get(keys[keys.length - 1])){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
