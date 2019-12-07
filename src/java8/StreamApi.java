package java8;

interface Parser{
    String parse(String str);
}
class Stringparser{
    public static String convert(String str){
        if (str.length()<=3)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();
        return str;
    }
}
class MyPrinter{
    public static void print(String str,Parser parser){
        str = parser.parse(str);
        System.out.println(str);
    }
}

public class StreamApi {
    public static void main(String[] args) {
        String s ="Sau";
        MyPrinter m = new MyPrinter();
        /*m.print(s, new Parser() {
            @Override
            public String parse(String str) {
                return Stringparser.convert(str);
            }
        });*/
        m.print(s,Stringparser::convert);
    }
}
