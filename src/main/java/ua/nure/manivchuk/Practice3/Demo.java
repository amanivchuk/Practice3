package ua.nure.manivchuk.Practice3;

import ua.nure.manivchuk.Practice3.Part1.Part1;
import ua.nure.manivchuk.Practice3.Part2.Part2;

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

        /*======= Part 2 ===========*/
        System.out.println("======= Part 2 ===========");
        Part2 part2 = new Part2();
        part2.getMinAndMaxWords();
    }
}
