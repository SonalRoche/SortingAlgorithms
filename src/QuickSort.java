public class QuickSort implements Sort{
    @Override
    public void sort(int[] arr) {
        quicksort(arr, 0, arr.length-1);
        for (int i : arr) System.out.println(i);
    }

    private void quicksort(int[] A, int p, int r)
    {
        if (p < r)
        {
            int q = partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }
    }

    private int partition(int[] A, int p, int r)
    {
        int pivot = A[r];
        int i = p -1;
        for (int j=p; j<r; j++)
        {
            if (A[j] <= pivot)
            {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;

        return i+1;
    }

}
