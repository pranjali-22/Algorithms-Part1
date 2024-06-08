import java.util.Random;

public class Shuffle {

    public static void shuffle(Object[] a){
        Random rand = new Random();
        int length = a.length;
        for(int i = 0; i < length; i++){
            int r =  rand.nextInt(i+1);
            exchange(a,i,r);
        }
    }
    public static void exchange(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
