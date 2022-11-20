class RecursiveLinearSearch {
    static int arr[] = { 5, 15, 6, 9, 4 };

    // Recursive Method to search key in the array
    static int linearsearch(int arr[], int size, int key)
    {
        // 탐색에 실패할경우 -1 반환
        if (size == 0) {
            return -1;
        }
        else if (arr[size - 1] == key) {
            // key를 찾으면 해당 인덱스 반환
            return size - 1;
        }
        // 키를 찾을 때까지 재귀적으로 탐색
        else {
            return linearsearch(arr, size - 1, key);
        }
    }

    public static void main(String[] args)
    {
        int key = 4;

        // 탐색 시작
        int index = linearsearch(arr, arr.length, key);
        if (index != -1)
            System.out.println(
                    "찾으시는 숫자 " + key + "는 "
                            + index + "번 인덱스에 있습니다.");
        else
            System.out.println("해당 " + key
                    + "키는 존재하지 않습니다..");
    }
}
