package pattern;

public class Pattern_6 {
    public static void main(String[] args) {
        drawPattern(5);
        drawPatternrev(5);
    }

    private static void drawPatternrev(int val) {
        for (int i = val; i >= 1; i--) {
            for (int j = val; j >=i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void drawPattern(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = val; j >=i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
