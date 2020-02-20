package program;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {
    static String[] tensNames = new String[]{
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    static String[] specialNames = new String[]{
            "",
            " hundred",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };
    static Map<Integer, String> unitPlace = new HashMap<>();

    public static void main(String[] args) {
        unitPlace.put(null, "");
        unitPlace.put(0, " zero");
        unitPlace.put(1, " one");
        unitPlace.put(2, " two");
        unitPlace.put(3, " three");
        unitPlace.put(4, " four");
        unitPlace.put(5, " five");
        unitPlace.put(6, " six");
        unitPlace.put(7, " seven");
        unitPlace.put(8, " eight");
        unitPlace.put(9, " nine");
        unitPlace.put(10, " ten");
        unitPlace.put(11, " eleven");
        unitPlace.put(12, " twelve");
        unitPlace.put(13, " thirteen");
        unitPlace.put(14, " fourteen");
        unitPlace.put(15, " fifteen");
        unitPlace.put(16, " sixteen");
        unitPlace.put(17, " seventeen");
        unitPlace.put(18, " eighteen");
        unitPlace.put(19, " nineteen");
        int input = 756379743;
        String word = convertNumToWord(input);
        System.out.println(word);
    }

    private static String convertNumToWord(int number) {
        String prefix = new String();
        if (number == 0) { return unitPlace.get(number); }
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }

    private static String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20){
            current = unitPlace.get(number % 100);
            number /= 100;
        }
        else {
            current = unitPlace.get(number % 10);
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return unitPlace.get(number) + " hundred" + current;
    }
}
