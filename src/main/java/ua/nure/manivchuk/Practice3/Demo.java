package ua.nure.manivchuk.Practice3;

import ua.nure.manivchuk.Practice3.Part1.Part1;
import ua.nure.manivchuk.Practice3.Part2.Part2;
import ua.nure.manivchuk.Practice3.Part3.Part3;
import ua.nure.manivchuk.Practice3.Part4.Part4;
import ua.nure.manivchuk.Practice3.Part5.Part5;
import ua.nure.manivchuk.Practice3.utils.Util_test;

import java.security.NoSuchAlgorithmException;

/**
 * Created by nec on 15.11.17.
 */
public class Demo {
    public static void main(String[] args) {
        /*======= Part 1 ===========*/
        System.out.println("======= Part 1 ===========");
        Part1 part1 = new Part1();
        String p1 = part1.convert1();
        System.out.println(p1);
        String p2 = part1.convert2();
        System.out.println(p2);
        String p3 = part1.convert3();
        System.out.println(p3);
        String p4 = part1.convert4();
        System.out.println(p4);

        /*Another realization for Part 1.3 */
        String s = Util_test.getInput("src/main/resources/input.txt");
        System.out.println("Methode: another_convert3");
        System.out.println(Part1.another_convert3(s));

        /*======= Part 2 ===========*/
        System.out.println("======= Part 2 ===========");
        Part2 part2 = new Part2();
        part2.getMinAndMaxWords();
        System.out.println();

        /*======= Part 3 ===========*/
        System.out.println("======= Part 3 ===========");
        Part3 part3 = new Part3();
        System.out.println(part3.wordInUpperCase());

        /*====== Part 4 ============*/
        System.out.println("======= Part 4 ===========");
        Part4 part4 = new Part4();
        try {
            System.out.println(part4.hash("password", "SHA-256"));
            System.out.println(part4.hash("passwort", "SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        /*====== Part 5 ============*/
        System.out.println("======= Part 5 ===========");
        Part5 part5 = new Part5();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0 ; i <= 100; i++){
            String tmp = part5.decimal2Roman(i);
            stringBuffer.append(i).append(" ====> ").append(tmp).append(" ====> ").append(part5.roman2Decimal(tmp)).append("\n");
        }
        System.out.println(stringBuffer.toString());
    }
}
