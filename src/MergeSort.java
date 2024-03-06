public class MergeSort implements Sort{


    @Override
    public void sort(int[] arr) {

        merge_sort(arr, 0, arr.length-1);
        for (int i : arr) System.out.println(i);

    }

    private void merge_sort(int[] A, int p, int r)
    {

        if (p < r) {
            int q = (p + r) / 2;

            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }

    }

    private void merge(int[] A, int p, int q, int r)
    {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for (int i = 0; i < n1; i++)
        {
            L[i] = A[p+i];
        }
        for (int j = 0; j < n2; j++)
        {
            R[j] = A[q+j+1];
        }

        L[n1] = (int) Double.POSITIVE_INFINITY;
        R[n2] = (int) Double.POSITIVE_INFINITY;

        int i = 0; int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }

        }
    }

}
