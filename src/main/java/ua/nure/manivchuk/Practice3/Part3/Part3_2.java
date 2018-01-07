package ua.nure.manivchuk.Practice3.Part3;

import ua.nure.manivchuk.Practice3.utils.Util_test;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 1/7/2018.
 */
public class Part3_2 {
        public static void main(String[] args) throws IOException {
            String str3 = Util_test.getInput("src/main/resources/part3.txt");
            System.out.println(convert(str3));


        }


        public static String convert(String input) {

            final Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
            Matcher matcher = pattern.matcher(input);

            StringBuilder result = new StringBuilder();
            result.append(input);


            while (matcher.find()) {
                if (matcher.group().length() >= 1) {
                    result.replace(matcher.start(), matcher.start() + 1, matcher.group().substring(0, 1).toUpperCase());
                }
            }
            return result.append(System.lineSeparator()).toString();
        }
}
