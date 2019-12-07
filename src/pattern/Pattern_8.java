package pattern;

public class Pattern_8 {
    public static void main(String[] args) {
        drawPattern(5);
    }
    public static void drawPattern(int n){
        /*for (int i = 1; i <= val ; i++) {
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <=val; j++) {
                System.out.print(j);
            }

            System.out.println();
        }*/
        int k = 0;
        for(int i = 1; i <= n; i++, k = 0) {
            for(int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
               /* ++k;*/
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j);
                /*++k;*/
            }
            System.out.println();
        }
    }
}
