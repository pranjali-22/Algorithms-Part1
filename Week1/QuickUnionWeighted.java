// Wighted QUick Union - while connected or in union implementation, the smaller tree is connected to the larger tree
// Data Structure - same as quick union but mainatin an extr array sz[i] which counts the number of objects in the tree at root i
package Week1;

public class QuickUnionWeighted {
    private int[] id;
    private int[] sz;
    public QuickUnionWeighted(int n) {
        id = new int[n];
        sz = new int[n];
        for (int i : id) {
            id[i] = i;
            sz[i] = 1;
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
        if(sz[p_root] < sz[q_root]) {
            id[p_root] = q_root;
            sz[q_root] = sz[p_root]++;
        }
        else {
            id[q_root] = p_root;
            sz[p_root] = sz[q_root]++;
        }
        
    }
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
