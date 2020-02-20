package string;

public class StringRunner {

    public static void main(String[] args) {
        String str = "India     Is My    Country";
        char[] strArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strArray.length ; i++) {
            if ((strArray[i] != ' ') && (strArray[i] !='\t')){
                sb.append(strArray[i]);
            }
        }
        System.out.println(sb);

        String rev = "";
        for (int i = 0; i <str.length() ; i++) {
            rev = str.charAt(i)+rev;
        }

        System.out.println("reverse String :" + rev);

        String a= null;
        String b = "bcda";
        if (checkIsrotation(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    private static boolean checkIsrotation(String a, String b) {
        if (null == a || null == b){
            return false;
        }
        if (null != a && null != b){
            String c= a+a;
            if (c.contains(b)){
                return true;
            }
        }
        else if (a.length() != b.length()){
            return false;
        }else
            return false;
        return false;
    }

}
