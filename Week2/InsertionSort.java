public class InsertionSort {
    public static void sort(Comparable[] a) {
        int length = a.length;
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; (j > 0 && j < length); j--) {
                if(less(a[j],a[j-1])){
                    exchange(a,j,j-1);
                }
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
