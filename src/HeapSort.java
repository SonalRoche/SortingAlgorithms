public class HeapSort implements Sort{

    int heapSize;

    @Override
    public void sort(int[] arr) {
        heapsort(arr);
        for (int i : arr) System.out.println(i);
    }

    private void heapsort(int[] A)
    {
        buildMaxHeap(A);

        for (int i = A.length -1; i >= 1; i--)
        {
            swap(A, 0, i);
            heapSize--;
            maxHeapify(A, 0);

        }
    }

    private void maxHeapify(int[] A, int i)
    {
        int l = 2*i;
        int r = 2*i + 1;
        int largest = i;

        if (l <= heapSize -1 && A[l] > A[i])
        {
            largest = l;
        }

        if (r <= heapSize -1 && A[r] > A[largest])
        {
            largest = r;
        }

        if (largest != i)
        {
            swap(A, i, largest);
            maxHeapify(A, largest);
        }

    }

    private void buildMaxHeap(int[] A)
    {
        heapSize = A.length;
        int n = Math.floorDiv(A.length-1, 2);

        for (int i = n; i>=0; i--)
        {
            maxHeapify(A,i);
        }
    }

    private void swap(int[] A, int index1, int index2)
    {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
