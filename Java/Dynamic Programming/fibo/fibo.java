package dp;

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...

public class Fibo {
    static final int[] dp = new int[100];
    // 최적화 하지 않았을 때
    public static int fibo(int n){
        if(n <= 2)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    // Top down 방식
    public static int topDown(int n){
        if(n <= 1)
            return 1;
        else{
            // 이미 구한 숫자라면 계산하지 않음
            if(dp[n] > 0){
                return dp[n];
            }
            dp[n] = topDown(n-1)+topDown(n-2);
            return dp[n];
        }
    }
    // Bottom up 방식
    public static int bottomUp(int n){
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];   // 재귀호출을 하지않아 오버헤드가 없음
    }

    public static void main(String[] args){
        int top = topDown(5);   // 인덱스로 계산
        System.out.println(top);
        int bottom = bottomUp(4);
        System.out.println(bottom);
    }
}



