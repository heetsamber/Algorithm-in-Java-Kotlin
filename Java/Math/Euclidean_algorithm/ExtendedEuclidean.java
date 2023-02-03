import java.lang.*;
import java.util.*;

class ExtendedEuclidean {
    public static int gcdExtended(int a, int b, int x, int y){
        // Base Case
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }

        int x1 = 1, y1 = 1;
        int gcd = gcdExtended(b % a, a, x1, y1);

        x = y1 - (b / a) * x1;
        y = x1;

        return gcd;
    }

    // Test code
    public static void main(String[] args) {
        int x = 1, y = 1;
        int a = 35, b = 15;
        int g = gcdExtended(a, b, x, y);
        System.out.print("gcd(" + a + " , " + b
                + ") = " + g);
    }
}
