package pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        drawPattern(5);
    }
    public static void drawPattern(int val){
        for (int i = val; i >=1; i--) {
            for (int j = 1; j <=i  ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
