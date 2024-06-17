package Week3;

public class Quicksort {
    public static int partition(Comparable[] a,int lo, int hi){
        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
            if (i == hi) break;
            while (less(a[lo], a[--j]))
            if (j == lo) break;
             if (i >= j) break;
             exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }
    public static void quicksort(Comparable[] a, int start, int end) {
        if (end <= start)  return;
        int piv_idx = partition(a,start,end);
        quicksort(a,start,piv_idx-1);
        quicksort(a,piv_idx+1,end);
    }
    public static void sort(Comparable[] a) {
        quicksort(a,0,a.length-1);
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
