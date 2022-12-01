public class SelectionSort {
    void sort(int array[]){
        int length = array.length;

        for(int i = 0; i < length - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < length; j++){
                if(array[j] < array[min_idx])
                    min_idx = j;
            }

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    void printArray(int array[]){
        int n = array.length;
        for(int i = 0; i < n; ++i){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
