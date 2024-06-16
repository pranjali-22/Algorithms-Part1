package Week3;

public class Mergesort {

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        int i = lo; // left array
        int j = mid+1; // right array
        for(int k = lo; k <= hi; k++){
            if(i > mid) {
                a[k] = aux[j];
                j++;
            }
            else if(j > hi) {
                a[k] = aux[i];
                i++;
            }
            else if(less(aux[j], aux[i])) {
                a[k] = aux[j];
                j++;
            }
            else {
                a[k] = aux[i];
                i++;
            }
        }
    }
     public static void mergesort(Comparable[] a, Comparable[] aux, int lo, int hi) {
       if (hi <= lo) return;
       int mid = (lo+hi)/2;
       mergesort(a,aux, lo, mid);
       mergesort(a, aux, mid+1, hi);
       merge(a,aux,lo,mid,hi);
       

    }
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        mergesort(a, aux, 0, a.length - 1);
        // for (int k = 0; k <= a.length; k++){
        //     a[k] = aux[k];
        // }
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