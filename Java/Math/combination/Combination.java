import java.util.Scanner;

class Combination{
    private static int count = 0;
    private static int[] order = new int[4];

    public static int combination(int[] arr, int n, int r, int cur, int pos){
        if(cur == r){
            for(int i = 0; i < r; i++){
                System.out.print(arr[order[i]] + " ");
            }
            System.out.print("\n");
            count++;

            return 0;       // 아무 의미 아님
        }

        for(int idx = pos; idx < n; idx++){
            order[cur] = idx;
            combination(arr, n, r, cur + 1, idx + 1);
        }
        return count;
    }
}

class Test{
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("r: ");
        int r = sc.nextInt();

        System.out.println(n + "C" + r);
        int cnt = Combination.combination(arr, n, r, 0, 0);
        System.out.println("조합의 개수 " + cnt);
    }
}