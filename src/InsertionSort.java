public class InsertionSort implements Sort{

    @Override
    public void sort(int[] arr) {

        int key,j;

        for (int i = 1; i< arr.length; i++)
        {
            key = arr[i];
            j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        for (int k : arr) System.out.println(k);
    }
}
