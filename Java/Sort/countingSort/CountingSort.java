class CountingSort {
    void sort(char arr[]) {
        int n = arr.length;

        char output[] = new char[n];

        // 아스키 코드로 비교를 위한 배열 선언
        int count[] = new int[256];

        // 정렬하려는 배열을 순회하며 그 값에 맞는 아스키코드 배열 카운팅
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        // 카운팅된 배열의 값들을 누적합으로 설정한다.
        // 카운팅 배열의 각 값은 (시작점 - 1)을 알려준다.
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    // 테스트 코드
    public static void main(String args[])
    {
        CountingSort ob = new CountingSort();
        char arr[] = { 'h', 'e', 'l', 'l', 'o', 'w',
                       'w', 'o', 'r', 'l', 'd'      };
        ob.sort(arr);
        System.out.print("정렬후 : ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }
}
