public class StableSelectionSort {
    static void stableSelectionSort(int[] a, int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[min] > a[j])
                    min = j;

            int key = a[min];
            while (min > i)
            {
                a[min] = a[min - 1];
                min--;
            }

            a[i] = key;
        }
    }
    static void printArray(int[] a, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+ " ");
        System.out.println();
    }

    public static void main (String[] args)
    {
        int[] a = { 4, 5, 3, 2, 4, 1 };
        int n = a.length;
        stableSelectionSort(a, n);
        printArray(a, n);
    }
}
