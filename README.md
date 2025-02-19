This repository contains Java implementations of the major sorting algorithms, demonstrating a variety of techniques used to sort data efficiently. The algorithms included are:

Insertion Sort
Heap Sort
Quick Sort
Merge Sort
Counting Sort

Each sorting algorithm is implemented in its own class, and the repository provides a simple way to test and compare their performance.

Algorithms Implemented
1. Insertion Sort
Insertion Sort builds the final sorted array one item at a time. It is much like sorting playing cards in your hands. The algorithm is efficient for small datasets but inefficient on large datasets with O(n²) complexity.

2. Heap Sort
Heap Sort is a comparison-based sorting algorithm that works by converting the array into a binary heap, then repeatedly extracting the maximum (or minimum) element to build a sorted array. It has an average time complexity of O(n log n).

3. Quick Sort
Quick Sort is a divide-and-conquer algorithm. It works by selecting a pivot element and partitioning the array around the pivot. The sub-arrays are then sorted recursively. It is often considered one of the fastest sorting algorithms in practice, with an average time complexity of O(n log n).

4. Merge Sort
Merge Sort is another divide-and-conquer algorithm that splits the array into halves, recursively sorts them, and merges the sorted halves back together. It has a time complexity of O(n log n) and is stable, meaning it preserves the relative order of elements with equal values.

5. Counting Sort
Counting Sort is an integer sorting algorithm that assumes the range of input values is known. It counts the occurrences of each element and places them in the correct position in the sorted array. Counting Sort has a time complexity of O(n + k), where n is the number of elements and k is the range of the numbers.
