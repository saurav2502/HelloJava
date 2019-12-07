package pattern;

public class Pattern_3 {
    public static void main(String[] args) {
        drawPattern(5);
    }
    public static void drawPattern(int val){
        for (int i = 1; i <= val ; i++) {
            for (int j = val; j >=i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
