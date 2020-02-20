package program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 2, 4, 5, 2, 5, 5, 1, 3, 4, 6, 4, 3, 6, 4, 5};
        int ele = findMostRepeatedEle(arr);
        System.out.println(ele);
        String str = "hi Saurav";
        char c = findMostRepeatedString(str);
        System.out.println(c);
        String rev = reverseString(str);
        System.out.println(rev);
        int[] arr2 = {1, 5, 2, 3, 2, 4, 5, 2, 5, 5, 1, 3, 4, 6, 4, 3, 6};
        int[] r = findLostElementOfArray(arr, arr.length, arr2, arr2.length);
        System.out.println(r);
        findDuplicatesUsingJava8(arr2);

    }

    private static void findDuplicatesUsingJava8(int[] arr2) {
        Set<Integer> uniqueEle = new HashSet<>();
        Set<Integer> duplicateEle = new HashSet<>();
        for (int i : arr2) {
            if (!uniqueEle.add(i)) {
                Integer integer = i;
                duplicateEle.add(integer);
            }
        }
        System.out.println(duplicateEle);
    }

    private static int[] findLostElementOfArray(int[] arr, int length1, int[] arr2, int length2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int p = 0, q = 0;
        for (Integer a : arr) {
            map1.put(a, p++);
        }
        for (Integer b : arr2) {
            map2.put(b, q++);
        }
        return null;
    }

    private static String reverseString(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            ret = str.charAt(i) + ret;
        }
        return ret;
    }

    private static char findMostRepeatedString(String str) {
        char ret = 0;
        int frequency = 0;
        Map<Character, Integer> countmap = new HashMap<>();
        char[] charArr = str.toCharArray();
        for (Character c : charArr) {
            if (!countmap.containsKey(c)) {
                countmap.put(c, 1);
            } else {
                countmap.put(c, countmap.get(c) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = countmap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > frequency) {
                ret = entry.getKey();
                frequency = entry.getValue();
            }
        }
        return ret;
    }

    private static int findMostRepeatedEle(int[] arr) {
        int ele = 0, frequency = 0;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i : arr) {
            if (integerMap.containsKey(i)) {
                integerMap.put(i, integerMap.get(i) + 1);
            } else {
                integerMap.put(i, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = integerMap.entrySet();
        for (Map.Entry<Integer, Integer> set : entrySet) {
            if (set.getValue() > frequency) {
                ele = set.getKey();
                frequency = set.getValue();
            }
        }
        return ele;
    }
}
