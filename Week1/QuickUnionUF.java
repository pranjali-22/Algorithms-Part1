package Week1;
// QuickUnionUF - id[i] is the parent of i
// intialise - intialise an array 
//           - set the value of each element to be the index of the array
//           - no elements have root
// root - finds the root of an element
// union - union(p,q) - set q's root as the parent of p's root
// connected - elements with same root are connected

public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int n){
        id = new int[n];
        for(int i : id) {
            id[i] = i;
        }
    }
    private int root(int p) {
        int i = id[p];
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public void union (int p, int q) {
        int p_root = root(p);
        int q_root = root(q);
        id[p_root] = q_root;
    }
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
}
