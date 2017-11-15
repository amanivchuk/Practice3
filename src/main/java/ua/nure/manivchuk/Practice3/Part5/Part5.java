package ua.nure.manivchuk.Practice3.Part5;

/**
 * Created by nec on 15.11.17.
 */
public class Part5 {
  /*  public static String decimal2Roman( int x) {

        StringBuffer sb = new StringBuffer();
//        Выделяем сотни
        int c1 = x / 100;
        sb.append(C(c1));
//        остаток из сотни
        int c2 = x % 100;

//        Выделяем полсотни
        int l1 = c2 / 50;
        sb.append(L(l1));
//        остаток из полсотни
        int l2 = c2 % 50;

//        Выделяем десятки
        int x1 = l2 / 10;
        sb.append(X(x1));
//        остаток из десятки
        int x2 = l2 % 10;

//        Выделяем то что осталось
        sb.append(basic(x2));

        return sb.toString();
    }


    private static String C(int c1) {
        if(c1 ==1){
            return "C";
        }
        return "";
    }

    private static String L(int l1) {
        if(l1 == 4)
            return "XC";

        return "L";
//        return "";
    }

    private static String X(int x1) {
        if(x1 == 4) return "XC";
        else if((x1 != 0) && (x1 < 4)){
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (i < x1){
                stringBuffer.append("X");
                i++;
            }
            return stringBuffer.toString();
        }
        else {
            return "";
        }
    }

    private static String basic(int x2) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[x2];
    }*/


    static String[] Rome = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] Arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    static int numbers[] = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
    static String letters[] = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public int roman2Decimal(String rome) {

        StringBuffer romeNumber = new StringBuffer(rome);
        int arabNumber = 0, i = 0;
        // Проверяем переданную строку на наличие символов
        if (romeNumber.length() > 0) {
            while (true) {
                do {
                    if (Rome[i].length() <= romeNumber.length()) {
                        // Выделяем из строки подстроку и сравниваем со
                        // значением из массива Arab
                        if (Rome[i].equals(romeNumber.substring(0, Rome[i].length()))) {
                            // После чего прибавляем число соответствующее
                            // индексу элемента римской цифры из массива Arab
                            arabNumber += Arab[i];
                            // и удаляем из строки римскую цифру
                            romeNumber.delete(0, Rome[i].length());
                            if (romeNumber.length() == 0)
                                return arabNumber;
                        } else
                            break;
                    } else
                        break;
                } while (romeNumber.length() != 0);
                i++;
            }
        }
        return 0;
    }

    public String decimal2Roman(int number) {
        String romanValue = "";

        int N = number;

        while (N > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (N < numbers[i]) {
                    N -= numbers[i - 1];
                    romanValue += letters[i - 1];
                    break;
                }
            }
        }
        return romanValue;
    }
}
