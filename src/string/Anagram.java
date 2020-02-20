package string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = new String("Listen");
        String s2 = new String("Silent");
        boolean result  = findAnagram(s1,s2);
        System.out.println(result);
    }

    private static boolean findAnagram(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        char[] t1 = s1.toLowerCase().toCharArray();
        char[] t2 = s2.toLowerCase().toCharArray();
        Arrays.sort(t1);
        Arrays.sort(t2);
        for (int i = 0; i < t1.length; i++) {
            for (int j = i; j <t2.length ; j++) {
                if (t1[i] == t2[j]) {
                    break;
                }else return false;
            }

        }
        return true;
    }

}
