public class CountingSort implements Sort{

    int k;
    public CountingSort(int k) {

        this.k = k;
    }

    @Override
    public void sort(int[] A) {

        int len = A.length;
        int[] B = new int[len];
        int[] C = new int[k+1]; // init to 0 by default

        for (int i = 0; i < len; i++)
        {
            int num = A[i];
            C[num] = C[num] + 1;
        }

        for (int j = 1; j <= k; j++)
        {
            C[j] = C[j] + C[j-1];
        }

        for (int i = len-1; i >= 0; i--)
        {
            B[C[A[i]]-1] = A[i];
            C[A[i]] = C[A[i]] - 1;
        }

        for (int n : B) System.out.println(n);



    }
}
