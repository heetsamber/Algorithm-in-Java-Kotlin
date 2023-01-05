

class MergeSort{
    // 병합한다.
    void merge(int arr[], int left, int mid, int right){

        // 병합할 두개의 배열 하위크기 찾기
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for(int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int left, int right){
        if(left < right){
            // 중앙값을 계산 (오버플로우 방지)
            int mid = left + (right - left) / 2;

            // 반으로 계속 나눈다.
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // 정렬하면서 병합한다.
            merge(arr, left, mid, right);
        }
    }

}

class Test{
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1, 6, 8, 7};

        System.out.println("정렬전");
        printArray(arr);

        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, arr.length - 1);

        System.out.println("\n정렬후");
        printArray(arr);
    }
}
