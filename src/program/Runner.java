package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,2,4,5,2,5,5,1,3,4,6,4,3,6,4,5};
        int ele = findMostRepeatedEle(arr);
        System.out.println(ele);
        String str = "hi Saurav";
        char c = findMostRepeatedString(str);
        System.out.println(c);
    }

    private static char findMostRepeatedString(String str) {
        char ret = 0;
        int frequency=0;
        Map<Character, Integer>countmap = new HashMap<>();
        char[] charArr = str.toCharArray();
        for (Character c: charArr){
            if (!countmap.containsKey(c)){
                countmap.put(c,1);
            }else {
                countmap.put(c,countmap.get(c)+1);
            }
        }
        Set<Map.Entry<Character,Integer>>entries = countmap.entrySet();
        for (Map.Entry<Character,Integer>entry : entries){
            if (entry.getValue()>frequency){
                ret = entry.getKey();
                frequency = entry.getValue();
            }
        }
        return ret;
    }

    private static int findMostRepeatedEle(int[] arr) {
        int ele=0,frequency=0;
        Map<Integer, Integer>integerMap = new HashMap<>();
        for (int i: arr){
            if (integerMap.containsKey(i)){
                integerMap.put(i,integerMap.get(i)+1);
            }else {
                integerMap.put(i,1);
            }
        }
        Set<Map.Entry<Integer,Integer>>entrySet = integerMap.entrySet();
        for (Map.Entry<Integer,Integer>set : entrySet){
            if (set.getValue() > frequency){
                ele = set.getKey();
                frequency = set.getValue();
            }
        }
        return ele;
    }
}
