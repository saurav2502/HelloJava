import java.util.*;

public class FindWeight {
    public static void main(String[] args) {
        Long weight = Long.valueOf(40);
        String str = findSmallestStr(weight);
        System.out.println(str);
    }

    private static String findSmallestStr(Long weight) {
        StringBuffer sb = new StringBuffer();
        Map<Character, String> map = new HashMap<>();
        long a =1;
        map.put('A',String.valueOf(a));
        int charCount = 65;
        for (int i = 2; i<=26 ; i++){
            charCount++;
            Long count = i * a + a;
            a= count;
            map.put((char)charCount,String.valueOf(count));
        }
        Map<Character, String> retmap = new HashMap<>();
        for (Map.Entry<Character, String> entry: map.entrySet()) {
            if (weight >= Long.valueOf(entry.getValue()) && Long.valueOf(entry.getValue()) > 0){
                retmap.put(entry.getKey(),entry.getValue());
            }
        }
        List<Long>list = new ArrayList<>();
        retmap.entrySet().stream().forEach(value ->list.add(Long.valueOf(value.getValue())));
        Collections.sort(list, Collections.reverseOrder());
        for (Long val : list){
            Long daata = findString(weight,val);
            weight = weight -val;
            for (Map.Entry<Character, String> entry: retmap.entrySet())
                if (entry.getValue().equals(String.valueOf(val))){
                    sb.append(entry.getKey());
                }
            while (daata >= val){
                Long daata1 = findString(weight,val);
                weight = weight -val;
                for (Map.Entry<Character, String> entry: retmap.entrySet())
                    if (entry.getValue().equals(String.valueOf(val))){
                        sb.append(entry.getKey());
                    }
                }
            if (weight == 0){
                break;
            }

        }

        return comapare(sb.toString());
    }

    private static String comapare(String sb) {
        char[] ar = sb.toCharArray();
        Arrays.sort(ar);
        return  new String(ar);

        //return null;
    }

    private static Long findString(Long weight, Long val) {
        Long data = weight - val;
            return data;
    }


}
