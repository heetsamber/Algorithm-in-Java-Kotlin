package math.power;

public class RecursivePower {
    public static double getPower(double x, int degree){
        if(degree == 0) return 1;
        else if(degree % 2 == 0) return getPower(x * x, degree / 2);

        return x * getPower(x * x, (degree - 1) / 2);
    }

    public static void main(String[] args){
        double res = RecursivePower.getPower(2, 10);
        System.out.println(res);
    }
}
