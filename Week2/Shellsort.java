public class Shellsort {
    public static void sort(Comparable[] a) {
        int h = 1;
        int len = a.length;
        while (h < len/3){
            h = 3*h + 1;
        } 
        
        // i - current pointer
        // next pointer = i + h
        // prev pointer = i - h
        while (h > 0) {
            System.out.println("h: "+ h);
            for(int i = 0; (i+h < len); i++) {
                if(less(a[i+h],a[i])){
                    exchange(a,i,i+h);
                }
                for(int j = i; j-h >= 0; j = j-h){
                    if(less(a[j],a[j-h])){
                        exchange(a,j-h,j);
                    }
                }
            }
            h = (h-1)/3;
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
