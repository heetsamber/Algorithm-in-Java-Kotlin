class LinearSearch {
    public static int search(int arr[], int x)
    {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 7, 12, 35 };
        int x = 12;

        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "찾으시는 숫자가 배열내에 존재하지않습니다.");
        else
            System.out.print("해당 숫자는 "
                    + result+"번 인덱스에 있습니다.");
    }
}
