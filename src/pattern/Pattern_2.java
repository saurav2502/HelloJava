package pattern;

public class Pattern_2 {
    public static void main(String[] args) {
        drawaPattern(5);
    }

    private static void drawaPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
