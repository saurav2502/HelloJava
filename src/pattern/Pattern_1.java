package pattern;

public class Pattern_1 {
    public static void main(String[] args) {
        drawPattern(100);
    }

    private static void drawPattern(int n) {
        int count =0;
        for (int i = 1; i <= n ; i++) {
            for (int j=1;j<=i; j++) {
                count++;
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }System.out.println();
        }
    }
}
