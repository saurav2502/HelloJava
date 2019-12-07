package pattern;

public class Pattern_7 {
    public static void main(String[] args) {
        drawPattern(5);
    }
    public static void drawPattern(int val){
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
