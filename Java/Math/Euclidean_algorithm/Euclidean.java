class Euclidean{
    public static int gcd(int a, int b){
        if(a == 0) return b;

        return gcd(b % a, a);
    }

    public static void main(String[] args){
        int a = 12, b = 36, result;

        result = gcd(a, b);
        System.out.println("gcd : " + result);
    }
}