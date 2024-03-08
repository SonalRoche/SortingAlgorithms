//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //int[] arr = {2, 3, 7, 1, 3, 5, 3};
        int[] arr = {10, 6, 2, 3, 7, 1, 5, 3,9,4};

        Sort insertion = new InsertionSort();
        System.out.println("Insertion Sort");
        insertion.sort(arr);

        Sort merge = new MergeSort();
        System.out.println("Merge Sort");
        merge.sort(arr);

        Sort quick = new QuickSort();
        System.out.println("Quick Sort");
        quick.sort(arr);

        Sort heap = new HeapSort();
        System.out.println("Heap Sort");
        heap.sort(arr);

        Sort count = new CountingSort(10);
        System.out.println("Counting Sort");
        count.sort(arr);

    }
}