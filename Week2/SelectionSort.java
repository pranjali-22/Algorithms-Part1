// Invariant  - The array to the left of the current pointer is sorted.
//            - No element to the right of the pointer is smaller than any element to the left
//            - find the minimum element in the right and exchange it

public class SelectionSort {
    public static void sort(Comparable[] a) {
        int length = a.length;
        for(int i = 0; i < length; i++) {
            int min = i;
            for(int j = i+1; j <length; j++) {
                if(less(a[j],a[min])) {
                    min = j;
                }
            }
            if(less(a[min], a[i])){
                exchange(a, i, min);
            }
        }
    }
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    public static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}