package ua.nure.manivchuk.Practice3.Part1;

import ua.nure.manivchuk.Practice3.utils.ReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nec on 15.11.17.
 */
public class Part1 {
    private List<String> stringList;
    private StringBuffer stringBuffer;

    public String convert1(){
         /*
            ivanov==>ivanov@mail.ru
            petrov==>petrov@google.com
            obama==>obama@google.com
            bush==>bush@mail.ru
        */
        stringList = ReadFile.readFile("src/main/resources/input.txt");
        stringBuffer = new StringBuffer();

        for(String str : stringList){
            String[] list = str.split(";");
            if(!list[0].equals("Login") && !list[1].equals("Name") && !list[2].equals("Email") ){
                stringBuffer.append(list[0]).append(" ==> ").append(list[list.length-1]).append(System.lineSeparator());
            }
        }
//        System.out.println(stringBuffer.toString());

        return stringBuffer.toString();
    }

    public String convert2(){
        /*
        Output of convert2
            IvanovIvan(email:ivanov@mail.ru)
            PetrovPetr(email:petrov@google.com)
            ObamaBarack(email:obama@google.com)
            BushGeorge(email:bush@mail.ru)
       */
        stringList = ReadFile.readFile("src/main/resources/input.txt");
        stringBuffer = new StringBuffer();
        for(String str : stringList){
            String[] list = str.split(";");
            if(!list[0].equals("Login") && !list[1].equals("Name") && !list[2].equals("Email") ){
                stringBuffer.append(list[1]).append(" (email: ").append(list[list.length-1]).append(")").append(System.lineSeparator());
            }
        }
//        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    public String convert3(){
        /*
        Output of convert3
            mail.ru ==> ivanov, bush
            google.com ==> petrov, obama
       */
        stringList = ReadFile.readFile("src/main/resources/input.txt");
        stringBuffer = new StringBuffer();
        String list = stringList.toString();
        Pattern pattern = Pattern.compile("\\w*\\.\\w*");
        Matcher matcher = pattern.matcher(list);
        while (matcher.find()){
            String match = list.substring(matcher.start(), matcher.end());

            if(!stringBuffer.toString().contains(match)){
                stringBuffer.append(match).append(" ==> ");
            }

            List<String> familyList = new ArrayList<>();
            for(int i = 0; i < stringList.size(); i++){

                if(stringList.get(i).contains(match)){
                    String[] strList = stringList.get(i).split(";");
                    if(!stringBuffer.toString().contains(strList[0])) {
                        familyList.add(strList[0]);
                    }
                }
            }
            for(int i = 0; i < familyList.size(); i++){
                stringBuffer.append(familyList.get(i));
                if(!(i >= familyList.size()-1)){
                    stringBuffer.append(", ");
                }else {
                    stringBuffer.append(System.lineSeparator());
                }
            }
        }
//        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    public String convert4(){
        /*
        * Login;Name;Email;Password
          ivanov;Ivan Ivanov;ivanov@mail.ru;2344
          petrov;Petr Petrov;petrov@google.com;3423
          obama;Barack Obama;obama@google.com;6554
          bush;George Bush;bush@mail.ru;4534
        */
        stringList = ReadFile.readFile("src/main/resources/input.txt");
        stringBuffer = new StringBuffer();

        Random random = new Random();

       for(int i = 1 ; i < stringList.size(); i++){
           stringBuffer.append(stringList.get(i)).append(";").append(random.nextInt(10000)+1000).append(System.lineSeparator());
       }
//        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }
}
